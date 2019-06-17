package com.example.massage;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class bodydetail extends AppCompatActivity {
    int bodytype_img;
    String name;
    Button Counttime;
    TextView Sec, Bodytype2;
    ImageView Bodydetail;
    Boolean timeon = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodydetail);
        Sec = (TextView) findViewById(R.id.sec);
        Bodytype2 = (TextView) findViewById(R.id.bodytype2);
        Bodydetail = (ImageView) findViewById(R.id.bodydetail);
        Counttime = (Button) findViewById(R.id.countime);

        Counttime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!timeon)
                {
                    Counttime.setText("finish");
                    new CountDownTimer(10000,1000) {
                        @Override
                        public void onTick(long sec) {
                            Sec.setText(" " +sec/1000);
                        }

                        @Override
                        public void onFinish() {
                            Toast.makeText(bodydetail.this, "請舒緩按摩處!", Toast.LENGTH_LONG)
                                    .show();
                        }
                    }.start();
                }
                else
                    {
                        Toast.makeText(bodydetail.this, "finish!", Toast.LENGTH_SHORT).show();
                        finish();
                }
            }
        });

        Sec.setText(" ");

        if (getIntent() != null) {
            bodytype_img = getIntent().getIntExtra("bodytype_img", -1);
            name = getIntent().getStringExtra("name");
        }
    }
}