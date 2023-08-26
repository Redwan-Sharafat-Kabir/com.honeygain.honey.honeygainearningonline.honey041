package com.honeygaincash.honeygaincase038;

import static com.honeygaincash.honeygaincase038.honeygaincase038_SplashActivity.dialogbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class honeygaincase038_Exit extends AppCompatActivity {
    public String TAG = String.valueOf(getClass());

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.honeygaincase038_exitactivity);

        dialogbox(this);

        int[] containerIDs = {
                R.id.fragmentContainer1, R.id.fragmentContainer2, R.id.fragmentContainer3,
                R.id.fragmentContainer4, R.id.fragmentContainer5, R.id.fragmentContainer6,
                R.id.fragmentContainer7, R.id.fragmentContainer8, R.id.fragmentContainer9,
                R.id.fragmentContainer10, R.id.fragmentContainer11, R.id.fragmentContainer12,
                R.id.fragmentContainer13, R.id.fragmentContainer14, R.id.fragmentContainer15,
                R.id.fragmentContainer16, R.id.fragmentContainer17, R.id.fragmentContainer18,
                R.id.fragmentContainer19, R.id.fragmentContainer20
        };

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        for (int i = 0; i < containerIDs.length; i++) {
            UnifiedWebViewFragment1 fragment = new UnifiedWebViewFragment1();
            String tag = "fragmentTag" + (i + 1);
            fragmentTransaction.replace(containerIDs[i], fragment, tag);
        }

        fragmentTransaction.commit();


        Button button = (Button) findViewById(R.id.exitapp);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                honeygaincase038_Exit.this.startActivity(new Intent(honeygaincase038_Exit.this, honeygaincase038_Thank_you.class));

            }
        });
        Button button1 = (Button) findViewById(R.id.btn_no);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                honeygaincase038_Exit.this.startActivity(new Intent(honeygaincase038_Exit.this, honeygaincase038_start_page.class));
            }
        });
    }

}
