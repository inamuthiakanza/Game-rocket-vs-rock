import greenfoot.*;

/**
 * Write a description of class button2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button2 extends Actor
{
    /**
     * Act - do whatever the button2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        clk();
    }    
    public void clk(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Background());
           //Greenfoot.playSound("");
        }
    }
}
