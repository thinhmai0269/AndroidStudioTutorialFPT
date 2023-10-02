package com.example.appchamdiem.lab.lab3.bai3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appchamdiem.R;

import java.util.List;

public class AdapterPlayer extends BaseAdapter {
    Context context;
    int layout;
    List<Player> playerList;

    public AdapterPlayer(Context context, int layout, List<Player> playerList) {
        this.context = context;
        this.layout = layout;
        this.playerList = playerList;
    }

    @Override
    public int getCount() {
        return playerList.size();
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        //AX
        TextView namePlayer = (TextView) view.findViewById(R.id.player_name);
        TextView descriptionPlayer = (TextView) view.findViewById(R.id.player_description);
        ImageView imagePlayer= (ImageView) view.findViewById(R.id.player_image);
        ImageView imageNation =(ImageView) view.findViewById(R.id.nation_image);

        //
        Player player = playerList.get(i);
        namePlayer.setText(player.getName());
        descriptionPlayer.setText(player.getDescription());
        imagePlayer.setImageResource(player.getImagePlayer());
        imageNation.setImageResource(player.getImageNation());
        //


        return view;
    }
}