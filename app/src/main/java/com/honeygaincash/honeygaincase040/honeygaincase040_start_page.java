package com.honeygaincash.honeygaincase038;


import static com.honeygaincash.honeygaincase038.honeygaincase038_SplashActivity.dialogbox;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.zhouyou.view.seekbar.SignSeekBar;


public class honeygaincase038_start_page extends AppCompatActivity {
    LinearLayout start;
    ImageView up_down, up_down1, up_down2;
    Button start4, start5, start6;
    LinearLayout L1;
    LinearLayout l1_1, l2, l3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.honeygaincase038_start_page);

        dialogbox(this);


        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String savedData = sharedPreferences.getString("thirdcharacter", null);
        String savedData1 = sharedPreferences.getString("forthcharacter", null);
        if (savedData != null && savedData.equals("1") && savedInstanceState == null) {
        UnifiedWebViewFragment fragment1 = new UnifiedWebViewFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment1, "fragmentTag1").commit();
        }
        if (savedData1 != null && savedData1.equals("1") && savedInstanceState == null) {
            UnifiedWebViewFragment fragment2 = new UnifiedWebViewFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer1, fragment2, "fragmentTag2").commit();
        }

        id();

        L1 = findViewById(R.id.L1);
        SignSeekBar signSeekBar3 = findViewById(R.id.demo_3_seek_bar_3);
        L1 = findViewById(R.id.L1);

        signSeekBar3.getConfigBuilder()
                .min(0)
                .max(10)
                .secondTrackColor(ContextCompat.getColor(honeygaincase038_start_page.this, R.color.color_green))
                .showSectionText()
                .showThumbText()
                .build();


        this.start = findViewById(R.id.start);
        this.start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Dialog dialog = new Dialog(honeygaincase038_start_page.this);
                dialog.setContentView(R.layout.honeygaincase038_dialogbox);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.anim.fade_in;
                dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public void onShow(DialogInterface dialog) {
                        new CountDownTimer(1500, 500) {

                            @Override
                            public void onTick(long millisUntilFinished) {

                            }

                            @Override
                            public void onFinish() {
                                dialog.dismiss();
                                honeygaincase038_start_page.this.startActivity(new Intent(honeygaincase038_start_page.this, honeygaincase038_Next.class));


                            }
                        }.start();
                    }
                });
                dialog.show();


            }
        });
        this.start4 = findViewById(R.id.z);
        this.start4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Dialog dialog = new Dialog(honeygaincase038_start_page.this);
                dialog.setContentView(R.layout.honeygaincase038_dialogbox);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.anim.fade_in;
                dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public void onShow(DialogInterface dialog) {
                        new CountDownTimer(1500, 500) {

                            @Override
                            public void onTick(long millisUntilFinished) {

                            }

                            @Override
                            public void onFinish() {
                                dialog.dismiss();
                                honeygaincase038_start_page.this.startActivity(new Intent(honeygaincase038_start_page.this, honeygaincase038_submit.class));
                                finish();


                            }
                        }.start();
                    }
                });
                dialog.show();


            }
        });
        this.start5 = findViewById(R.id.z1);
        this.start5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Dialog dialog = new Dialog(honeygaincase038_start_page.this);
                dialog.setContentView(R.layout.honeygaincase038_dialogbox);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.anim.fade_in;
                dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public void onShow(DialogInterface dialog) {
                        new CountDownTimer(1500, 500) {

                            @Override
                            public void onTick(long millisUntilFinished) {

                            }

                            @Override
                            public void onFinish() {
                                dialog.dismiss();
                                honeygaincase038_start_page.this.startActivity(new Intent(honeygaincase038_start_page.this, honeygaincase038_submit.class));
                                finish();


                            }
                        }.start();
                    }
                });
                dialog.show();


            }
        });
        this.start6 = findViewById(R.id.z2);
        this.start6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Dialog dialog = new Dialog(honeygaincase038_start_page.this);
                dialog.setContentView(R.layout.honeygaincase038_dialogbox);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.anim.fade_in;
                dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public void onShow(DialogInterface dialog) {
                        new CountDownTimer(1500, 500) {

                            @Override
                            public void onTick(long millisUntilFinished) {

                            }

                            @Override
                            public void onFinish() {
                                dialog.dismiss();
                                honeygaincase038_start_page.this.startActivity(new Intent(honeygaincase038_start_page.this, honeygaincase038_submit.class));
                                finish();


                            }
                        }.start();
                    }
                });
                dialog.show();


            }
        });


        l1_1.setVisibility(View.GONE);
        l2.setVisibility(View.GONE);
        l3.setVisibility(View.GONE);
        up_down.setImageResource(R.drawable.honeygaincase038_up_arrow);
        up_down1.setImageResource(R.drawable.honeygaincase038_up_arrow);
        up_down2.setImageResource(R.drawable.honeygaincase038_up_arrow);

        up_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (l1_1.getVisibility() == View.GONE) {
                    l1_1.setVisibility(View.VISIBLE);
                    up_down.setImageResource(R.drawable.honeygaincase038_down_arrow);
                } else {
                    l1_1.setVisibility(View.GONE);
                    up_down.setImageResource(R.drawable.honeygaincase038_up_arrow);
                }

            }
        });
        up_down1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (l2.getVisibility() == View.GONE) {
                    l2.setVisibility(View.VISIBLE);
                    up_down1.setImageResource(R.drawable.honeygaincase038_down_arrow);
                } else {
                    l2.setVisibility(View.GONE);
                    up_down1.setImageResource(R.drawable.honeygaincase038_up_arrow);
                }

            }
        });
        up_down2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (l3.getVisibility() == View.GONE) {
                    l3.setVisibility(View.VISIBLE);
                    up_down2.setImageResource(R.drawable.honeygaincase038_down_arrow);
                } else {
                    l3.setVisibility(View.GONE);
                    up_down2.setImageResource(R.drawable.honeygaincase038_up_arrow);
                }

            }
        });

    }

    private void id() {
        up_down = findViewById(R.id.up_down);
        up_down1 = findViewById(R.id.up_down1);
        up_down2 = findViewById(R.id.up_down2);
        l1_1 = findViewById(R.id.l1_1);
        l2 = findViewById(R.id.l2);
        l3 = findViewById(R.id.l3);

    }

    public void onBackPressed() {
        startActivity(new Intent(honeygaincase038_start_page.this, honeygaincase038_Exit.class));
    }


}