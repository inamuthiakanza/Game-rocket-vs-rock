import greenfoot.*;

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
     private int speed;
    public Rock()
    {
        GreenfootImage image = getImage();  
        image.scale(30, 30);
        setImage(image);        
        speed = 5;
    }
    
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
         int xPos = this.getX();
         int yPos = this.getY();
        if(xPos < 25)
        {
            this.die();
        }
        else
        {
          setLocation(xPos - 17, yPos);
        }
    }    
     public void die() 
    {
        World w = this.getWorld();
        w.removeObject(this);
    }
     public void setSpeed( int s)
    {
        this.speed = s;
    }
    /**
     * the getSpeed method returns the current value of the speed variable.
     * 
     * @return the speeed
     */
    public int getSpeed()
    {
        return this.speed;
    }
  
}
