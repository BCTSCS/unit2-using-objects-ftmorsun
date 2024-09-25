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
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        FastFish fastFish = new FastFish();
        addObject(fastFish,181,121);
        FastFish fastFish2 = new FastFish();
        addObject(fastFish2,168,283);
        FastFish fastFish3 = new FastFish();
        addObject(fastFish3,429,141);
        FastFish fastFish4 = new FastFish();
        addObject(fastFish4,515,314);
        Shark shark = new Shark("Baby", 8);
        addObject(shark,210,159);
        SlowFish slowFish = new SlowFish();
        addObject(slowFish,339,65);
        SlowFish slowFish2 = new SlowFish();
        addObject(slowFish2,301,275);
        SlowFish slowFish3 = new SlowFish();
        addObject(slowFish3,64,128);
        SlowFish slowFish4 = new SlowFish();
        addObject(slowFish4,170,24);
    }
}
