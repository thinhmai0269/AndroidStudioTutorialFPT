package com.example.appchamdiem.lab.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appchamdiem.R;
import com.example.appchamdiem.lab.lab1.bai4.lab1bai4Activity;
import com.example.appchamdiem.lab.lab1.lab1Activity;
import com.example.appchamdiem.lab.lab2.bai1.lab2bai1Activity;
import com.example.appchamdiem.lab.lab2.bai2.lab2bai2Activity;
import com.example.appchamdiem.lab.lab2.bai3.lab2bai3p1Activity;

public class lab2Activity extends AppCompatActivity {
    Button bai1,bai2,bai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2_detail);
        anhxa();
        bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab2Activity.this, lab2bai1Activity.class);
                startActivity(intent);
            }
        });
        bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab2Activity.this, lab2bai2Activity.class);
                startActivity(intent);
            }
        });
        bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab2Activity.this, lab2bai3p1Activity.class);
                startActivity(intent);
            }
        });
    }
    private void anhxa(){
         bai1 = (Button) findViewById(R.id.lab2bai1);
         bai2 = (Button) findViewById(R.id.lab2bai2);
         bai3 = (Button) findViewById(R.id.lab2bai3);
    }
}
