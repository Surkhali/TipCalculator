package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button calculatorBtn;
    private RadioGroup radioGc;
    private Switch roundUpSwitch;
    private TextView tipText;
    private double tipAmount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatorBtn = findViewById(R.id.calculatorButton);
        radioGc = findViewById(R.id.radioGroup);
        roundUpSwitch = findViewById(R.id.roundUpSwitch);
        tipText = findViewById(R.id.tipAmountText);

        calculatorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}