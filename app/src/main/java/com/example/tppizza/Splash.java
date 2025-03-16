package com.example.tppizza;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tppizza.MainActivity;
import com.example.tppizza.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Find the ImageView
        ImageView imageView = findViewById(R.id.imageView);

        // Load zoom-in animation
        Animation zoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        imageView.startAnimation(zoomIn); // Start the animation

        // Delay before opening MainActivity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Splash.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000); // 3 seconds delay
    }
}
