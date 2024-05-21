import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 10;
    public Projectile(){
        getImage().scale(30,30);
    }
    public void act()
    {
        turnToMouse();
        move(speed);
        
        // Add your action code here.
    }
    public void turnToMouse(){
    
    }
}
