package com.honeygaincash.honeygaincase038;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class honeygaincase038_submit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.honeygaincase038_activity_submit);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(honeygaincase038_submit.this, honeygaincase038_start_page.class);
                startActivity(i);
                finish();

            }
        },6000);
    }

    @Override
    public void onBackPressed() {

    }
}