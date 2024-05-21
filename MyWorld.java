import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(3000, 700, 1, false); 
        getBackground().setColor(new Color(135, 206, 235));
        getBackground().fill();
        addObject(new Ground(), 322, 646);
        addObject(new Ground(), 968, 646);
        addObject(new Ground(), 1616, 646);
       // addObject(new Ground(), 2264, 647);
        addObject(new Ground(), 2912, 646);
        
        addObject(new Tall(200,200), 1011, 494);
        addObject(new Tall(150,150), 835, 519);
        addObject(new Tall(80,80), 724, 554);
        
        addObject(new plat1(), 1777, 400);
        addObject(new plat2(), 1825, 400);
        addObject(new plat3(), 1871, 400);
        addObject(new plat1(), 2147, 400);
        addObject(new plat2(), 2194, 400);
        addObject(new plat3(), 2239, 400);
        addObject(new plat1(), 2493, 400);
        addObject(new plat2(), 2541, 400);
        addObject(new plat3(), 2589, 400);
    
        addObject(new Enemy(), 578, 564);
        addObject(new Enemy(), 1090, 368);
        addObject(new Enemy(), 1567, 565);
        addObject(new Enemy(), 1877, 367);
        addObject(new Enemy(), 2243, 364);
        addObject(new Enemy(), 2585, 366);
        addObject(new Enemy(), 2868, 567);
        
        addObject(new player(), 50, 500 );
        
    }
}
