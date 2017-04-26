package alayluya.loopin.com.loopin_alayluya.Activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import alayluya.loopin.com.loopin_alayluya.Pojo.SignUpRequest;
import alayluya.loopin.com.loopin_alayluya.Pojo.SignUpReturn;
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
 * Created by ranja_000 on 4/2/2017.
 */

public class SignUpActivity extends Activity {

    Context context;

    @BindView(R2.id.activity_sing_up_tv)
    TextView tvSignUp;
    @BindView(R2.id.activity_sing_up_tv_first_name)
    TextView tvFName;
    @BindView(R2.id.activity_sing_up_tv_last_name)
    TextView tvLName;
    @BindView(R2.id.activity_sing_up_tv_email)
    TextView tvEmail;
    @BindView(R2.id.activity_sing_up_tv_password)
    TextView tvPass;
    @BindView(R.id.activity_sing_up_tv_re_type)
    TextView tvRetype;

    @BindView(R2.id.activity_sing_up_et_first_name)
    EditText etFName;
    @BindView(R2.id.activity_sing_up_et_last_name)
    EditText etLName;
    @BindView(R2.id.activity_sing_up_et_email)
    EditText etEmail;
    @BindView(R2.id.activity_sing_up_et_password)
    EditText etPass;
    @BindView(R2.id.activity_sing_up_et_re_type)
    EditText etRePass;

    @BindView(R2.id.activity_sing_up_btn_sign_up)
    Button btnSignUp;

    SignUpRequest signUpRequest;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.activity_sing_up_btn_sign_up)
    void submitButton(View view) {
        if (view.getId() == R.id.activity_sing_up_btn_sign_up) {
            // Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
            String FirstName = (etFName.getText().toString());
            String LastName = (etLName.getText().toString());
            String Email = (etEmail.getText().toString());
            String Password = (etPass.getText().toString());
            String ConfirmPassword = (etPass.getText().toString());
            String LanguageId = "1";
            if(etRePass.getText().length()<3||etRePass.getText().length()<3||etEmail.getText().length()<3||
                    etFName.getText().length()<3||etLName.getText().length()<3){
                Toast.makeText(SignUpActivity.this, "Fill all the fields", Toast.LENGTH_SHORT).show();
            }
            else if(!(etPass.getText().toString()).equals(etRePass.getText().toString())){
                Toast.makeText(SignUpActivity.this, "Password not matched", Toast.LENGTH_SHORT).show();
            }
            else {
                signUpRequest = new SignUpRequest(FirstName, LastName, Email, Password, ConfirmPassword, LanguageId);

                signup();
            }
        }
    }

    private void signup() {
        if (signUpRequest != null) {
            RestClient.getClient().LoopinSignUp(signUpRequest)
                    .enqueue(new Callback<SignUpReturn>() {
                        @Override
                        public void onResponse(Call<SignUpReturn> call, Response<SignUpReturn> response) {
                            if (response != null && response.body() != null) {
                                if (response.body().isSuccess()) {
                                    /////////////toast for a time being//
                                    //////////////better if gets proper message form server////
                                    Toast.makeText(SignUpActivity.this, "sucessfully registered", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(SignUpActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(SignUpActivity.this, response.message(), Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<SignUpReturn> call, Throwable t) {
                            Toast.makeText(SignUpActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
        } else {
            Toast.makeText(this, "Please fill the above fields", Toast.LENGTH_SHORT).show();
        }
    }
}
