package com.yorubadev.alc4phase1.main;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.yorubadev.alc4phase1.R;
import com.yorubadev.alc4phase1.main.about.AboutActivity;
import com.yorubadev.alc4phase1.main.profile.ProfileActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupActionBar();

        Button btnABoutAlc = findViewById(R.id.btn_about_alc),
                btnProfile = findViewById(R.id.btn_my_profile);
        btnABoutAlc.setOnClickListener(view -> startActivity(new Intent(this, AboutActivity.class)));
        btnProfile.setOnClickListener(view -> startActivity(new Intent(this, ProfileActivity.class)));
    }

    private void setupActionBar() {
        setSupportActionBar(findViewById(R.id.toolbar));
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) actionBar.setTitle(R.string.app_name);
    }
}
