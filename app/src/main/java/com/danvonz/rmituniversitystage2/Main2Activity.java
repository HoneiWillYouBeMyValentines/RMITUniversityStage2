package com.danvonz.rmituniversitystage2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    TextView receive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        receive = (TextView) findViewById(R.id.textView1);
        receive.setText(getIntent().getStringExtra("EditTextValue1"));
        receive = (TextView) findViewById(R.id.textView2);
        receive.setText(getIntent().getStringExtra("EditTextValue2"));
        receive = (TextView) findViewById(R.id.textView2);

        receive = (TextView) findViewById(R.id.textView5);
        receive.setText(getIntent().getStringExtra("EditTextValue3"));
    }



}