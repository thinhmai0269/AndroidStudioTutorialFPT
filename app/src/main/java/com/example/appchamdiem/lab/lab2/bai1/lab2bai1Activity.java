package com.example.appchamdiem.lab.lab2.bai1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appchamdiem.R;

import java.util.Random;

public class lab2bai1Activity extends AppCompatActivity {
    EditText minValue;
    EditText maxValue;
    TextView result;
    Button buttonRandom;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2bai1);
        //lấy id
        minValue =(EditText) findViewById(R.id.minNumber);
        maxValue =(EditText) findViewById(R.id.maxNumber);
        result =(TextView)findViewById(R.id.txtResult);
        buttonRandom =(Button)findViewById(R.id.buttonRandom);


        //xử lý
        buttonRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(minValue.getText().toString());
                int max = Integer.parseInt(maxValue.getText().toString());
                Random random = new Random();
                int number = random.nextInt((max - min + 1)) + min;
                result.setText(number+"");
            }
        });
    }
}