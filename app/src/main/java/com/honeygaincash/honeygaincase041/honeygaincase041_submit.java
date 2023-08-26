package com.honeygaincash.honeygaincase041;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class honeygaincase041_submit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.honeygaincase041_activity_submit);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(honeygaincase041_submit.this, honeygaincase041_start_page.class);
                startActivity(i);
                finish();

            }
        },6000);
    }

    @Override
    public void onBackPressed() {

    }
}