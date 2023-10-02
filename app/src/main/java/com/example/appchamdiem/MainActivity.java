package com.example.appchamdiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appchamdiem.lab.lab1.lab1Activity;
import com.example.appchamdiem.lab.lab2.lab2Activity;
import com.example.appchamdiem.lab.lab3.lab3Activity;

public class MainActivity extends AppCompatActivity {
    Button lab1,lab2,lab3,lab4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            anhxa();

        lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, lab1Activity.class);

                startActivity(intent);
            }
        });
        lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, lab2Activity.class);

                startActivity(intent);
            }
        });
        lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, lab3Activity.class);

                startActivity(intent);
            }
        });
        lab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, lab1Activity.class);

                startActivity(intent);
            }
        });
    }
    private void anhxa(){
        lab1 = (Button) findViewById(R.id.lab1);
        lab2 = (Button) findViewById(R.id.lab2);
        lab3 = (Button) findViewById(R.id.lab3);
        lab4 = (Button) findViewById(R.id.lab4);
    }
}
