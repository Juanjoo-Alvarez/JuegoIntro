import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = -3;
    int count = 0;
    int health = 3;
    boolean hitProjectile = false;
    public Enemy(){
        getImage().mirrorHorizontally();
    }
    public void act()
    {   
        count++;
        moveArround();
        hitByProjectile();
        // Add your action code here.
    }
    public void moveArround(){
        if(count < 60)
        setLocation(getX() + speed, getY());
        else{
        speed = -speed;
        getImage().mirrorHorizontally();
        count = 0;
        }
    }
    public void hitByProjectile(){
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile != null && !hitProjectile){
            health--;
            hitProjectile = true;
            getWorld().removeObject(projectile);
        }
        else if(!isTouching(Projectile.class)){
            hitProjectile = false;
        }
        if(health <= 0)
        getWorld().removeObject(this);
    }
}
