package com.honeygaincash.honeygaincase041;


import static com.honeygaincash.honeygaincase041.honeygaincase041_SplashActivity.dialogbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;



public class honeygaincase041_MainActivity2 extends AppCompatActivity {

    Button btn1;
    public String TAG = String.valueOf(getClass());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.honeygaincase041_main2);

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
            honeygaincase041_UnifiedWebViewFragment1 fragment = new honeygaincase041_UnifiedWebViewFragment1();
            String tag = "fragmentTag" + (i + 1);
            fragmentTransaction.replace(containerIDs[i], fragment, tag);
        }

        fragmentTransaction.commit();


        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(honeygaincase041_MainActivity2.this, honeygaincase041_Continue_Next.class);
                startActivity(i);
            }
        });

    }

    public void onBackPressed() {
        super.onBackPressed();
    }

}

