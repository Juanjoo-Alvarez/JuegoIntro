import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int vspeed = 0;
    int accel = 0;
    int speed = 5;
    
    public void act()
    {
        jump();
        checkFalling();
        fall();
        moveArround();
        fireProject();
        // Add your action code here.
    }
    public void fireProject(){
        if(Greenfoot.mouseClicked(null)){
            Projectile projectile = new Projectile(); 
            getWorld().addObject(projectile, getX(), getY());
            projectile.turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY()); 
        }
    }
    public void moveArround(){
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {  
           setLocation(getX() - speed , getY()); 
        }
    }
    public void fall(){
        setLocation(getX(), getY()  + vspeed);
    }
    
    public void checkFalling(){
        if(!isTouching(Ground.class))
        {
            vspeed++;
        }
        else if(isTouching(Ground.class)){
            setLocation(getX(), getY() - 1);
            vspeed = 0;
        }
    }
    
    public void jump()
    {
        if(Greenfoot.isKeyDown("space"))
        {
           vspeed = -12; 
        }
    }
}
