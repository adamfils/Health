package com.adamapps.healthcareapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void FBClick(View view) {
        YoYo.with(Techniques.RubberBand).duration(500).playOn(view);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),HOME.class));
                finish();
            }
        },250);
    }

    public void LoginClick(View view) {
        YoYo.with(Techniques.RubberBand).duration(500).playOn(view);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),HOME.class));
                finish();
            }
        },250);

    }

    public void ForgotClick(View view) {
        YoYo.with(Techniques.Shake).duration(500).playOn(view);
    }

    public void SignUpClick(View view) {
        YoYo.with(Techniques.Pulse).duration(500).playOn(view);
    }
}
