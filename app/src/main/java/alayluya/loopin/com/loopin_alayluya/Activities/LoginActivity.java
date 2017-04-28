package alayluya.loopin.com.loopin_alayluya.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import alayluya.loopin.com.loopin_alayluya.Constants.Constant;
import alayluya.loopin.com.loopin_alayluya.Helper.GlobalState;
import alayluya.loopin.com.loopin_alayluya.Pojo.LoginReturn;
import alayluya.loopin.com.loopin_alayluya.Pojo.UserProfileReturn;
import alayluya.loopin.com.loopin_alayluya.R;
import alayluya.loopin.com.loopin_alayluya.R2;
import alayluya.loopin.com.loopin_alayluya.RetrofitHelper.RestClient;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by puncoz on 4/20/17.
 */

public class LoginActivity extends Activity {


    protected static final int REQUEST_CODE_RESOLUTION = 1;
    private static final int REQUEST_AUTHORIZATION = 1;
    private static final int REQUEST_ACCOUNT_PICKER = 2;
    String token;


    @BindView(R2.id.activity_login_et_email)
    EditText etEmail;

    @BindView(R2.id.activity_login_et_password)
    EditText etPassword;

    @BindView(R2.id.activity_login_btn_login)
    Button btnLogin;

    @BindView(R2.id.activity_login_btn_signup)
    Button btnSignUp;

    @BindView(R2.id.activity_login_tv_forget_password)
    TextView tvForgetPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.activity_login_btn_login)
    void loginButton(View view) {
        if (view.getId() == R.id.activity_login_btn_login) {
            String email = etEmail.getText().toString();
            String password = etPassword.getText().toString();

            if (etEmail.getText().length() < 3 || etPassword.getText().length() < 3) {
                Toast.makeText(this, "Please provide proper information", Toast.LENGTH_SHORT).show();
            } else {
                login();
            }
        }
    }

    private void login() {
        RestClient.getClient().LoopinLogin("grant_type=password&username=" + etEmail.getText().toString() + "&password=" + etPassword.getText().toString() + "")
                .enqueue(new Callback<LoginReturn>() {
                    @Override
                    public void onResponse(Call<LoginReturn> call, Response<LoginReturn> response) {
                      //  Log.d("responselogin", new Gson().toJson(response.body()));

                        if (response.body() != null) {
                            if (response.body().getTokenType().equals("bearer")) {

                                GlobalState state = GlobalState.singleton;
                                state.setPrefsIsLoggedIn(Constant.STATE_TRUE, 1);
                                state.setPrefsloggedUserInfo(new Gson().toJson(response.body()), 1);


                                //Toast.makeText(getActivity(), response.body().getMessage(), Toast.LENGTH_SHORT).show();

                                startActivity(new Intent(LoginActivity.this, MainActivity.class));

                            } else {
                                GlobalState state = GlobalState.singleton;
                                state.setPrefsIsLoggedIn(Constant.STATE_FALSE, 1);

                                Toast.makeText(LoginActivity.this, response.raw().message(), Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            if (response.code() == 400) {
                                Toast.makeText(LoginActivity.this, Constant.USERNAME_PASSWORD_NOT_MATCHED, Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(LoginActivity.this, "Network Error", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginReturn> call, Throwable t) {
                        Toast.makeText(LoginActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

    }

}
