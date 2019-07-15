package com.yorubadev.alc4phase1.main.profile;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import com.yorubadev.alc4phase1.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setupActionBar();

        ImageView imgProfile = findViewById(R.id.img_profile);
        Bitmap bitmapProfile = BitmapFactory.decodeResource(getResources(), R.drawable.me);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmapProfile);
        roundedBitmapDrawable.setCircular(true);
        imgProfile.setImageDrawable(roundedBitmapDrawable);
    }

    private void setupActionBar() {
        setSupportActionBar(findViewById(R.id.toolbar));
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.back_arrow_icon);
            actionBar.setTitle(R.string.label_profile);
        }
    }
}
