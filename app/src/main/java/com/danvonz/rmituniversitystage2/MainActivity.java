package com.danvonz.rmituniversitystage2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText SendValue1;
    EditText SendValue2;
    Button SendEditTextValue;
    Button SendMessage;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SendMessage = (Button) findViewById(R.id.button2);

        SendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareintent = new Intent();
                shareintent.setAction(Intent.ACTION_SEND);
                shareintent.setData(Uri.parse("smsto:"));
                shareintent.putExtra(Intent.EXTRA_STREAM, "Your Text Here");
                shareintent.setType("text/plain");
                startActivity(shareintent);

            }
        });


        SendEditTextValue = (Button) findViewById(R.id.button1);
        SendValue1 = (EditText) findViewById(R.id.editText1);
        SendValue2 = (EditText) findViewById(R.id.editText2);

        SendEditTextValue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("EditTextValue1", SendValue1.getText().toString());
                startActivity(intent);
                intent.putExtra("EditTextValue2", SendValue2.getText().toString());
                startActivity(intent);

            }
        });
    }
}
