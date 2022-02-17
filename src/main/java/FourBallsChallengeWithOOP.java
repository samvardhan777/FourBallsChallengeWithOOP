import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBallsChallengeWithOOP extends PApplet
{
    Ball b1=new Ball(1);
    Ball b2=new Ball(2);
    Ball b3=new Ball(3);
    Ball b4=new Ball(4);
    @Override
    public void draw()
    {

            getEllipse(b1);
            getEllipse(b2);
            getEllipse(b3);
            getEllipse(b4);

    }

    private void getEllipse(Ball b)
    {
        ellipse(b.getPositionX(), b.getPositionY(), b.Diameter, b.Diameter);
    }


    public static void main(String[] args)
    {
        PApplet.main("FourBallsChallengeWithOOP");
    }

    @Override
    public void settings() {
        super.settings();
        size(650,450);
    }

}
