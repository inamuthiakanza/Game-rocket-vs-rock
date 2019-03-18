import greenfoot.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class controller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class controller extends Actor
{
    private int stepCounter;
     private Person p;
    
    private Lives L1, L2, L3;
    public controller()
    {
         GreenfootImage gfi = this.getImage();
         gfi.clear();
         this.setImage(gfi);         
         L1 = new Lives();
         L2 = new Lives();
         L3 = new Lives();
         stepCounter = 0;
    }
    /**
     * Act - do whatever the controller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        stepCounter ++;
         World w = this.getWorld();
        if(stepCounter == 1)
        {
              w.addObject(L1,10,10);
              w.addObject(L2,30,10);
              w.addObject(L3,50,10);             
             ArrayList<Person> list = (ArrayList<Person>)w.getObjects(Person.class);
             this.p = list.get(0);
        }
         
        int randY = Greenfoot.getRandomNumber(240)+10;
        if(stepCounter % 25 == 0)
          {
               w.addObject(new Rock(), 640, randY);               
          }
        if(stepCounter % 115 == 0)
          {
               w.addObject(new Good(), 640, randY);               
          }
          this.personHitRock();
    }  
   public void personHitRock()
   {
       World w = this.getWorld();
       if( p.getHitRock() == true)
       {
           if(L3.getWorld() != null)
           {
               w.removeObject(L3);
           }
           else if(L2.getWorld() != null)
           {
               w.removeObject(L2);
           }
           else if(L1.getWorld() != null)
           {
               Greenfoot.setWorld(new end());
           }
           p.setHitRock(false);           
       }
   }
    }

