package com.yorubadev.alc4phase1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.yorubadev.alc4phase1.main.MainActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ProgressBar pbWorking = findViewById(R.id.pb_working);
        new Handler().postDelayed(() -> {
            pbWorking.setVisibility(View.VISIBLE);
            new Handler().postDelayed(() -> {
                startActivity(new Intent(this, MainActivity.class));
                finish();
            }, 2000);
        }, 1000);
    }
}
