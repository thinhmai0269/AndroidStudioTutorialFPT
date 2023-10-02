package com.example.appchamdiem.lab.lab3.bai3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appchamdiem.R;

import java.util.ArrayList;

public class lab3bai3ListPlayer extends AppCompatActivity {
    ListView LVPlayer;
    ArrayList<Player> playersArrayList;
    AdapterPlayer adapter;
    int selectedPlayers;

    TextView playerName;
    TextView playerDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab3bai3);

     AnhXa();
        adapter = new AdapterPlayer(this, R.layout.lab3bai3p2,playersArrayList);
        LVPlayer.setAdapter(adapter);
        /////
        LVPlayer.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            private boolean isLongClick = false;

            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Player player = playersArrayList.get(i);
                PlayerManager.setSelectedPlayer(player);

                // Chuyển đến màn hình chi tiết player
                Intent intent = new Intent(lab3bai3ListPlayer.this, lab3bai3DetailPlayer.class);
                startActivity(intent);

                isLongClick = true; // Đánh dấu là đã xử lý sự kiện giữ lâu
                return true; // Trả về true để ngăn sự kiện click ngắn xảy ra sau khi giữ lâu
            }

            // Sự kiện click ngắ
        });

    }

    private void AnhXa(){
        playerName =(TextView) findViewById(R.id.player_name);
        playerDescription=(TextView)findViewById(R.id.player_description);
        LVPlayer =(ListView) findViewById(R.id.PlayerList);
        playersArrayList= new ArrayList<>();
        playersArrayList.add(new Player(1,"TenPlayer", "Cau thu nguoi .........", R.drawable.player1, R.drawable.vietnam ));
        playersArrayList.add(new Player(2,"TenPlayer2", "Cau thu nguoi  .........", R.drawable.messi, R.drawable.ando ));
        playersArrayList.add(new Player(3,"TenPlayer3", "Cau thu nguoi  .........", R.drawable.player2, R.drawable.hanquoc ));
        playersArrayList.add(new Player(4,"TenPlayer4", "Cau thu nguoi  .........", R.drawable.player3, R.drawable.messi1 ));
        playersArrayList.add(new Player(5,"TenPlayer5", "Cau thu nguoi  .........", R.drawable.player4, R.drawable.ando ));
    }

}
