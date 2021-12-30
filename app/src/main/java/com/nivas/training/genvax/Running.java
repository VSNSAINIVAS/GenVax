package com.nivas.training.genvax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class Running extends AppCompatActivity {

    private static final long SPLASH_TIMEOUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent  = new Intent(Running.this,Login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIMEOUT);

    }
}