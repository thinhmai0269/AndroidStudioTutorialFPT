package com.example.appchamdiem.lab.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appchamdiem.R;
import com.example.appchamdiem.lab.lab1.bai4.lab1bai4Activity;
import com.example.appchamdiem.lab.lab1.lab1Activity;
import com.example.appchamdiem.lab.lab3.bai1.lab3bai1Activity;
import com.example.appchamdiem.lab.lab3.bai2.lab3bai2Activity;
import com.example.appchamdiem.lab.lab3.bai3.lab3bai3ListPlayer;

public class lab3Activity extends AppCompatActivity {
    Button bai1,bai2,bai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab1_detail);
        anhxa();
        bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab3Activity.this, lab3bai1Activity.class);
                startActivity(intent);
            }
        });
        bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab3Activity.this, lab3bai2Activity.class);
                startActivity(intent);
            }
        });
        bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab3Activity.this, lab3bai3ListPlayer.class);
                startActivity(intent);
            }
        });
    }
    private void anhxa(){
         bai1 = (Button) findViewById(R.id.lab1bai1);
         bai2 = (Button) findViewById(R.id.lab1bai2);
         bai3 = (Button) findViewById(R.id.lab1bai3);
    }
}
