import greenfoot.*;

/**
 * Write a description of class Good here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Good extends Rock
{
    /**
     * Act - do whatever the Good wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 
    
    private int speed;
    public Good()
    {
        GreenfootImage image = getImage();  
        image.scale(30, 30);
        setImage(image);        
        speed = 5;
    }
    }    

