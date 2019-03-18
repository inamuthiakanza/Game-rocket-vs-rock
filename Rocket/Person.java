import greenfoot.*;

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    private int gravity;
    private boolean hitRock;
    public int score;
    private controller c;
    private Background w;
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Person()
     {
       this.score = 0;
       this.hitRock = false;
       GreenfootImage gfi = this.getImage();
       gfi.scale(50,50);
       this.setImage(gfi);
     }
    public boolean getHitRock()
    {
         return this.hitRock;
    }
    public void setHitRock(boolean r)
    {
        this.hitRock = r;
    }
    
    public void act() 
    {
        GreenfootImage gfi = this.getImage();
        gfi.scale(50,50);
        this.setImage(gfi);
        this.updateScore();
        if(Greenfoot.isKeyDown("right") == true)
        {
            this.setImage(gfi);
            this.setRotation(0);   
            this.move(5);
        }    
        if(Greenfoot.isKeyDown("left") == true)
        {
            this.setImage(gfi);
            this.setRotation(180);   
            this.move(5);
        } 
        {
            gravity--;
            setLocation(getX(), getY() - gravity);
            checkForJump();
        }
        
         if(this.isTouching(Good.class) == true)
       {
           score = score + 100;
           this.removeTouching(Good.class);           
        }
        World w = this.getWorld();
         if(this.isTouching(Rock.class) == true)
       {
           this.removeTouching(Rock.class);
           this.setHitRock(true);          
       }
       if(this.isAtEdge() == true)
       {
          Greenfoot.setWorld(new end());
       }
    }
   
     public void updateScore()
   {
        score++;
        World w = this.getWorld();
        String display = "Score: "+this.score;   
        w.showText(display, 530, 50);        
    }
    private void checkForJump()
    {
        Actor a = getOneIntersectingObject(Person.class);
        if (Greenfoot.isKeyDown("up") == true) 
        {
            gravity = 10; 
        }
        if (Greenfoot.isKeyDown("down") == true) 
        {
            gravity = -10; 
        }
    }
   
}
   
    


