import greenfoot.*;

/**
 * Write a description of class button1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button1 extends Actor
{
    /**
     * Act - do whatever the button1 wants to do. This method is called whenever
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
