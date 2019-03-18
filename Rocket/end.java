import greenfoot.*;

/**
 * Write a description of class end here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class end extends World
{
    
    /**
     * Constructor for objects of class end.
     * 
     */
    public end()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 250, 1); 
        
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        button2 button2 = new button2();
        addObject(button2, 322, 189);
        
    }
    
}
