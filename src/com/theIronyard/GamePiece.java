package com.theIronyard;

import java.util.concurrent.ThreadLocalRandom;

public class GamePiece {

    private int positionX;
    private int positionY;
    private boolean frozen;
    private String name;
    private String color;


    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = "name";
        this.color = "color";
    }


    public void move(int newX, int newY) {
        if (frozen == false) {
//            newX = ThreadLocalRandom.current().nextInt(1, 100+1);
//            newY = ThreadLocalRandom.current().nextInt(1, 100+1);
            positionX = newX;
            positionY = newY;
        }
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", frozen=" + frozen +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }


    public void freeze() {
        frozen = true;
    }

    public void unfreeze() {
        frozen = false;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }


}