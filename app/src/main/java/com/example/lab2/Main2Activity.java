package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView myTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myTextView2 = (TextView) findViewById(R.id.myTextView2);
        Intent intent = getIntent();
        String s = intent.getStringExtra("message");
        myTextView2.setText("Hello " + s);
    }
}
