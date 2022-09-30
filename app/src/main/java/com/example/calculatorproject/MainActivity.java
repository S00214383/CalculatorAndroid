package com.example.calculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAdd(View view) {

        EditText etNo1 =  findViewById(R.id.editTextTextPersonName);
        EditText etNo2 =  findViewById(R.id.editTextTextPersonName2);
        TextView answer =  findViewById(R.id.tvResult);

        int number1 = Integer.parseInt(etNo1.getText().toString());
        int number2 = Integer.parseInt(etNo2.getText().toString());
        int result = number1 + number2;

        answer.setText(String.format("%s",result));

    }
}

