package com.example.snikdha.love_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,parter_name;
    Button btn_cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        parter_name=(EditText)findViewById(R.id.parter_name);
        btn_cal=(Button) findViewById(R.id.btn_cal);

    }

    public void btn_cal(View view) {
        String Name = name.getText().toString();
        String PName = parter_name.getText().toString();
        if (Name.isEmpty() || PName.isEmpty() || Name.equals(PName)) {
            Toast.makeText(this, "Please Enter the Names First OR Please Enter Different Name", Toast.LENGTH_LONG).show();
        } else {
            int num1 = getNumber(Name);
            int num2 = getNumber(PName);
            int avg = ((num1 + num2) / 2) % 100;
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("result", avg+"");
            startActivity(intent);
            //Toast.makeText(this, "Your Love is :\t" + avg + "%", Toast.LENGTH_LONG).show();
            name.setText("");
            parter_name.setText("");
        }
    }
    private int getNumber(String s){
        int i=0,sum=0;
        while (i<s.length()){
            char c=s.charAt(i);
            int ASCII= (int)c;
            sum= sum+ASCII;
            i++;
        }
        return sum;
    }
}
