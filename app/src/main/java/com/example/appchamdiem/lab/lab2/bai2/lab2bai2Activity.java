package com.example.appchamdiem.lab.lab2.bai2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appchamdiem.R;

public class lab2bai2Activity extends AppCompatActivity {
    EditText num1 ;
    EditText num2;
    Button plusbtn;
    Button minusbtn;
    Button multibtn;
    Button divbtn;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2bai2);

        num1 =(EditText) findViewById(R.id.fnumber);
        num2 =(EditText) findViewById(R.id.snumber);
        result =(TextView)findViewById(R.id.txtResult);
        plusbtn =(Button)findViewById(R.id.plusButton);
        minusbtn =(Button)findViewById(R.id.minusButton);
        multibtn =(Button)findViewById(R.id.mutiButton);
        divbtn =(Button)findViewById(R.id.divButton);

        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(num1.getText().toString());
                int max = Integer.parseInt(num2.getText().toString());

                int number =min+max;
                result.setText(number+"");
            }
        });
        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(num1.getText().toString());
                int max = Integer.parseInt(num2.getText().toString());

                int number =min-max;
                result.setText(number+"");
            }
        });
        multibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(num1.getText().toString());
                int max = Integer.parseInt(num2.getText().toString());

                int number =min*max;
                result.setText(number+"");
            }
        });
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = Integer.parseInt(num1.getText().toString());
                int max = Integer.parseInt(num2.getText().toString());

                if (max == 0) {
                    result.setText("Không thể chia cho 0");
                } else {
                    float resultValue = (float) min / max;
                    result.setText(String.format("%.2f", resultValue));
                }
            }
        });
    }
}