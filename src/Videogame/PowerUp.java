package Videogame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Sergon
 */
public class PowerUp extends Item
{    
    private int power;        // determines the kind of power
    Random rand = new Random();
    
    public PowerUp(int x, int y, int width, int height, Game game)
    {
        super(x, y, width, height);
        power = rand.nextInt(3) + 1;
    }

    public int getPower()
    {
        return power;
    }

    @Override
    public void tick()
    {
        setY(getY() + 3);   
        this.getRectangle().setLocation(getX(), getY());
    }

    @Override
    public void render(Graphics g)
    {
        switch (getPower())
        {
            case 1:
                g.setColor(Color.blue);
                break;
            case 2: 
                g.setColor(Color.white);
                break;
            case 3:
                g.setColor(Color.red);
        }
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }             
}
