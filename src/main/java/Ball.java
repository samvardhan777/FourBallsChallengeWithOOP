public class Ball
{
    public Ball(int position) {
        this.position = position;
    }
    private int position;
public final int Diameter=10;
int count=0;
int y=100;

    public int getPositionY()
    {
        int PositionY;
        PositionY=position*y;
        return PositionY;
    }

    public int getPositionX()
    {
        int PositionX;
        PositionX= (position *count)/2;
        count=count+2;
        return PositionX;
    }
}

