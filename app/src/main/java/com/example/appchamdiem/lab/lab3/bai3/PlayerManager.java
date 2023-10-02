package com.example.appchamdiem.lab.lab3.bai3;

public class PlayerManager {
    private static Player selectedPlayer;
    private static Player playerUpdate;
    public static Player getSelectedPlayer() {
        return selectedPlayer;
    }

    public static void setSelectedPlayer(Player player) {
        selectedPlayer = player;
    }
    public static void setPlayerUpdate(Player player) {
        playerUpdate = player;
    }

    public static Player getPlayerUpdate() {
        return playerUpdate;
    }


}
