package com.tw.fourBall;

public class Ball {
    private final int position;
    public final int diameter = 10;
    int count = 0;
    int y = 100;

    private Ball(int position) {
        this.position = position;
    }

    public static Ball createBall(int position) {
        return new Ball(position);
    }

    public int getPositionY() {
        int PositionY;
        PositionY = position * y;
        return PositionY;
    }

    public int getPositionX() {
        int PositionX;
        PositionX = (position * count) / 2;
        count = count + 2;
        return PositionX;
    }
}

