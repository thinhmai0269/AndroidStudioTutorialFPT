package com.example.appchamdiem.lab.lab3.bai2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appchamdiem.R;

import java.util.List;

public class lab3bai2AdapterFruit extends BaseAdapter {
    private  Context context;
    private  int layout;
    private List<lab3bai2Fruit> listFruit;

    public lab3bai2AdapterFruit(Context context, int layout, List<lab3bai2Fruit> listFruit) {
        this.context = context;
        this.layout = layout;
        this.listFruit = listFruit;
    }

    @Override
    public int getCount() {
        return listFruit.size();
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView txtName =(TextView) view.findViewById(R.id.fruit_name);
        TextView txtDes =(TextView) view.findViewById(R.id.fruit_description);
        ImageView imgFruit =(ImageView) view.findViewById(R.id.fruit_image);

        lab3bai2Fruit fruit = listFruit.get(i);

        txtName.setText(fruit.getName());
        txtDes.setText(fruit.getDescription());
        imgFruit.setImageResource(fruit.getImageResource());

        return view;
    }
}
