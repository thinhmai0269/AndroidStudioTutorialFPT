package com.example.appchamdiem.lab.lab3.bai3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appchamdiem.R;

import java.util.ArrayList;

public class lab3bai3DetailPlayer extends AppCompatActivity {
    TextView namePlayer;
    TextView descriptionPlayer;
    ImageView imagePlayer;
    ImageView imageNation;
    private static final int REQUEST_CODE = 1;
    ArrayList<Player> playersArrayListUpdate;
    AdapterPlayer adapterUpdate;
  Button btnUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab3bai3p1);

        Player selectedPlayer = PlayerManager.getSelectedPlayer();
        Player updatedPlayer;
        btnUpdate= (Button) findViewById(R.id.button);
        if (selectedPlayer != null) {
            //ax
             namePlayer = (TextView) findViewById(R.id.player_name_edit);
             descriptionPlayer = (TextView) findViewById(R.id.player_description_edit);
             imagePlayer= (ImageView) findViewById(R.id.player_image_edit);
             imageNation =(ImageView) findViewById(R.id.nation_image_edit);
            //
            namePlayer.setText(selectedPlayer.getName());
            descriptionPlayer.setText(selectedPlayer.getDescription());
            imagePlayer.setImageResource(selectedPlayer.getImagePlayer());
            imageNation.setImageResource(selectedPlayer.getImageNation());
        }
        btnUpdate.setOnClickListener(view -> {
            String newName = namePlayer.getText().toString();
            String newDescription = descriptionPlayer.getText().toString();
            selectedPlayer.setName(newName);
            selectedPlayer.setDescription(newDescription);
            Intent intent = new Intent(lab3bai3DetailPlayer.this, lab3bai3ListPlayer.class);
            startActivity(intent);
        });
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                // Nhận thông tin người chơi đã cập nhật từ PlayerManager
                Player updatedPlayer = PlayerManager.getPlayerUpdate();

                // Cập nhật danh sách người chơi trong adapter
                playersArrayListUpdate.set(updatedPlayer.getI(), updatedPlayer);

                // Thông báo cho ListView cần phải cập nhật giao diện
                adapterUpdate.notifyDataSetChanged();
            }
        }
    }
}