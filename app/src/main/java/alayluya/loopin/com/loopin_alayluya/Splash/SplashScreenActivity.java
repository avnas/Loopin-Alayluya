package alayluya.loopin.com.loopin_alayluya.Splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import alayluya.loopin.com.loopin_alayluya.Activities.LoginActivity;
import alayluya.loopin.com.loopin_alayluya.Activities.SignUpActivity;
import alayluya.loopin.com.loopin_alayluya.R;
import alayluya.loopin.com.loopin_alayluya.R2;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by puncoz on 4/20/17.
 */

public class SplashScreenActivity extends Activity {

    Thread th;

    @BindView(R2.id.activity_splash_screen_image)
            ImageView iv;
    @BindView(R2.id.activity_splash_screen_btnLogin)
            Button btnLogin;
    @BindView(R2.id.activity_splash_screen_btnSignUp)
            Button btnSignUp;

    int images[] = {R.drawable.bg1, R.drawable.bg2, R.drawable.bg3, R.drawable.bg4};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);

        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            int i = 0;

            public void run() {
                iv.setImageResource(images[i]);
                i++;
                if (i > images.length - 1) {
                    i = 0;
                }
                handler.postDelayed(this, 4000);  //for 4 sec interval...
            }
        };
        handler.postDelayed(runnable, 2000); //for initial delay..
    }

    @OnClick(R.id.activity_splash_screen_btnSignUp)
    void signUpRequest(View view) {
        if (view.getId() == R.id.activity_splash_screen_btnSignUp) {
            startActivity(new Intent(SplashScreenActivity.this, SignUpActivity.class));
        }
    }
    @OnClick(R.id.activity_splash_screen_btnLogin)
    void signInRequest(View view){
        if(view.getId()==R.id.activity_splash_screen_btnLogin){
            startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
            }
    }
}
