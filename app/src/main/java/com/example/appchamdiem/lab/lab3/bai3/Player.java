package com.example.appchamdiem.lab.lab3.bai3;

public class Player {
    int i;
    String name;
    String description;
    int imagePlayer;
    int imageNation;
     boolean isDetailMode;

    public Player(int i, String name, String description, int imagePlayer, int imageNation) {
        this.i = i;
        this.name = name;
        this.description = description;
        this.imagePlayer = imagePlayer;
        this.imageNation = imageNation;
        this.isDetailMode = false;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImagePlayer() {
        return imagePlayer;
    }

    public void setImagePlayer(int imagePlayer) {
        this.imagePlayer = imagePlayer;
    }

    public int getImageNation() {
        return imageNation;
    }

    public void setImageNation(int imageNation) {
        this.imageNation = imageNation;
    }

    public boolean isDetailMode() {
        return isDetailMode;
    }

    public void setDetailMode(boolean detailMode) {
        isDetailMode = detailMode;
    }
}

