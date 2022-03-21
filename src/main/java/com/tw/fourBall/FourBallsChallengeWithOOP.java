package com.tw.fourBall;

import processing.core.PApplet;

public class FourBallsChallengeWithOOP extends PApplet {
    private Ball b1, b2, b3, b4;

    @Override
    public void setup() {
        b1 = Ball.createBall(1);
        b2 = Ball.createBall(2);
        b3 = Ball.createBall(3);
        b4 = Ball.createBall(4);
    }

    @Override
    public void draw() {
        getEllipse(b1);
        getEllipse(b2);
        getEllipse(b3);
        getEllipse(b4);

    }

    private void getEllipse(Ball b) {
        ellipse(b.getPositionX(), b.getPositionY(), b.diameter, b.diameter);
    }

    public static void main(String[] args) {
        PApplet.main("com.tw.fourBall.FourBallsChallengeWithOOP");
    }

    @Override
    public void settings() {
        super.settings();
        size(650, 450);
    }

}
