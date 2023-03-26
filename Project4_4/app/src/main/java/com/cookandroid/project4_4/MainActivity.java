package com.cookandroid.project4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    Switch switchAgree;
    RadioGroup rGroup1;
    RadioButton rdoQ, rdoR, rdoS;
    ImageView imgIcon;
    Button btnExit, btnReturn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        switchAgree = (Switch) findViewById(R.id.SwitchAgree);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoQ = (RadioButton) findViewById(R.id.RdoQ);
        rdoR = (RadioButton) findViewById(R.id.RdoR);
        rdoS = (RadioButton) findViewById(R.id.RdoS);

        imgIcon = (ImageView) findViewById(R.id.ImgIcon);

        btnExit = (Button) findViewById(R.id.BtnExit);
        btnReturn = (Button) findViewById(R.id.BtnReturn);

        switchAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                if (switchAgree.isChecked() == true) {
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    imgIcon.setVisibility(android.view.View.VISIBLE);
                    btnExit.setVisibility(android.view.View.VISIBLE);
                    btnReturn.setVisibility(android.view.View.VISIBLE);
                } else {
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    imgIcon.setVisibility(android.view.View.INVISIBLE);
                    btnExit.setVisibility(android.view.View.INVISIBLE);
                    btnReturn.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });

        rdoQ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                imgIcon.setImageResource(R.drawable.android_q);
            }
        });

        rdoR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                imgIcon.setImageResource(R.drawable.android_r);
            }
        });

        rdoS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                imgIcon.setImageResource(R.drawable.android_s);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                finish();
            }
        });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                switchAgree.setChecked(false);
                text2.setVisibility(android.view.View.INVISIBLE);
                rGroup1.setVisibility(android.view.View.INVISIBLE);
                rGroup1.clearCheck();
                imgIcon.setVisibility(android.view.View.INVISIBLE);
                btnExit.setVisibility(android.view.View.INVISIBLE);
                btnReturn.setVisibility(android.view.View.INVISIBLE);
            }
        });
    }
}
