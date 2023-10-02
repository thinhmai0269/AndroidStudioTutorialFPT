package com.example.appchamdiem.lab.lab3.bai2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appchamdiem.R;

import java.util.ArrayList;

public class lab3bai2Activity extends AppCompatActivity {
    ListView LVFruit;
    ArrayList<lab3bai2Fruit> fruitArrayList;
    lab3bai2AdapterFruit adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab3bai2p1);

        AnhXa();
        adapter = new lab3bai2AdapterFruit(this, R.layout.lab3bai2p2,fruitArrayList);
        LVFruit.setAdapter(adapter);
    }

    private void AnhXa(){
        LVFruit =(ListView) findViewById(R.id.FruitList);
        fruitArrayList= new ArrayList<>();
        fruitArrayList.add(new lab3bai2Fruit(R.drawable.tao, "Táo", "Táo là một loại hoa quả ngon."));
        fruitArrayList.add(new lab3bai2Fruit(R.drawable.cam, "Cam", "Cam chứa nhiều vitamin C."));
        fruitArrayList.add(new lab3bai2Fruit(R.drawable.oi, "Oi", "Cam chứa nhiều vitamin C."));
        fruitArrayList.add(new lab3bai2Fruit(R.drawable.man, "Man", "Cam chứa nhiều vitamin C."));
        fruitArrayList.add(new lab3bai2Fruit(R.drawable.le, "Le", "Cam chứa nhiều vitamin C."));
        fruitArrayList.add(new lab3bai2Fruit(R.drawable.na, "Na", "Cam chứa nhiều vitamin C."));
    }
}