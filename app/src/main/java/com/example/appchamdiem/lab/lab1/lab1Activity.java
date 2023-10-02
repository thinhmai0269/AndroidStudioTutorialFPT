package com.example.appchamdiem.lab.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appchamdiem.MainActivity;
import com.example.appchamdiem.R;
import com.example.appchamdiem.lab.lab1.bai1.lab1bai1Activity;
import com.example.appchamdiem.lab.lab1.bai2.lab1bai2Activity;
import com.example.appchamdiem.lab.lab1.bai3.lab1bai3Activity;
import com.example.appchamdiem.lab.lab1.bai4.lab1bai4Activity;

public class lab1Activity extends AppCompatActivity {
    Button bai1,bai2,bai3,bai4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab1_detail);
        anhxa();
        bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab1Activity.this, lab1bai1Activity.class);
                startActivity(intent);
            }
        });
        bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab1Activity.this, lab1bai2Activity.class);
                startActivity(intent);
            }
        });
        bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab1Activity.this, lab1bai3Activity.class);
                startActivity(intent);
            }
        });
        bai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab1Activity.this, lab1bai4Activity.class);
                startActivity(intent);
            }
        });
    }
    private void anhxa(){
         bai1 = (Button) findViewById(R.id.lab1bai1);
         bai2 = (Button) findViewById(R.id.lab1bai2);
         bai3 = (Button) findViewById(R.id.lab1bai3);
         bai4 = (Button) findViewById(R.id.lab1bai4);
    }
}
