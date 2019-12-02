package com.example.snikdha.love_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
TextView love_per,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        love_per=(TextView) findViewById(R.id.love_per);
        result=(TextView) findViewById(R.id.result);
        result.setText(getIntent().getStringExtra("result")+"%");
    }
}
