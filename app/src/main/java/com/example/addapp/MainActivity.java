package com.example.addapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton(View view){
        //Editの取得
        EditText eT1 = (EditText) findViewById(R.id.et1);

        EditText eT2 = (EditText) findViewById(R.id.et2);

        //数値に変換
        String str1 = eT1.getText().toString();
        String str2 = eT2.getText().toString();

        int number1 = Integer.parseInt(str1);
        int number2 = Integer.parseInt(str2);

        //足し算
        int sum = number1 + number2;

        ((TextView)findViewById(R.id.tvAns)).setText("" +  sum);
    }

    public void onClear(View view)
    {
        ((EditText)findViewById(R.id.et1)).getText().clear();
        ((EditText)findViewById(R.id.et2)).getText().clear();
        ((TextView)findViewById(R.id.tvAns)).setText("answer");

    }
}