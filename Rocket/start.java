import greenfoot.*;

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends World
{

    /**
     * Constructor for objects of class start.
     * 
     */
    public start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        button1 button1 = new button1();
        addObject(button1, 295, 205);
        button1.setLocation(300, 250);
        button1.setLocation(315, 140);
    }
}
