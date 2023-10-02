package com.example.appchamdiem.lab.lab4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appchamdiem.MainActivity;
import com.example.appchamdiem.R;
import com.example.appchamdiem.lab.lab1.lab1Activity;

public class lab4Activity extends AppCompatActivity {
Button bai1,bai2,bai3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab1_detail);
        anhxa();
        bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab4Activity.this, lab1Activity.class);

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
