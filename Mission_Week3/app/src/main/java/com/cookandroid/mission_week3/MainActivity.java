package com.cookandroid.mission_week3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView img1, img2;
    Button btnUp, btnDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("3주차 미션");

        img1 = findViewById(R.id.Img1);
        img2 = findViewById(R.id.Img2);

        btnUp = findViewById(R.id.BtnUp);
        btnDown = findViewById(R.id.BtnDown);

        btnUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                img1.setImageResource(R.drawable.photo);
                img2.setImageResource(0);
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                img1.setImageResource(0);
                img2.setImageResource(R.drawable.photo);
            }
        });
    }
}
