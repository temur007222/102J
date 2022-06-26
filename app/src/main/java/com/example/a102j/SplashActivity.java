package com.example.a102j;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        CountDownTimer();
    }

    void CountDownTimer(){
        new CountDownTimer(2000, 1000){
            @Override
            public void onTick(long l) {}

            @Override
            public void onFinish() {
                openSignInActivity();
            }
        }.start();
    }

   void openSignInActivity(){
       Intent intent = new Intent(this, SignInActivity.class);
       startActivity(intent);
       finish();
    }
}