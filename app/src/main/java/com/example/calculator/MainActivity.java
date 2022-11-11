package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(view -> Sum());
        button2.setOnClickListener(view -> vu());
    }

    public void Sum() {
        try {
            TextView txt1 = findViewById(R.id.editTextNumberDecimal);
            TextView txt2 = findViewById(R.id.editTextNumberDecimal2);
            TextView txtResult = findViewById(R.id.textResult);

            int num1 = Integer.parseInt(String.valueOf(txt1.getText()));
            int num2 = Integer.parseInt(String.valueOf(txt2.getText()));
            int sum = num1 + num2;

            txtResult.setText("Сумма = " + sum);
        } catch (Exception ex) {
            Toast t = Toast.makeText(this, ex.getMessage(), Toast.LENGTH_LONG);
            t.show();
        }
    }

    public void vu(){
        try {
            TextView txt1 = findViewById(R.id.editTextNumberDecimal);
            TextView txt2 = findViewById(R.id.editTextNumberDecimal2);
            TextView txtResult = findViewById(R.id.textResult);

            int num1 = Integer.parseInt(String.valueOf(txt1.getText()));
            int num2 = Integer.parseInt(String.valueOf(txt2.getText()));
            int vu = num1 - num2;

            txtResult.setText("Разность = " + vu);
        } catch (Exception ex) {
            Toast t = Toast.makeText(this, ex.getMessage(), Toast.LENGTH_LONG);
            t.show();
        }
    }
}