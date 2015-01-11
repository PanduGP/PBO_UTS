import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Biji here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Biji extends Actor
{
    /**
     * Act - do whatever the Biji wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor Air;
        Air=getOneObjectAtOffset(0,0,Air.class);
        if(Air !=null)
        {
            World world;
            world=getWorld();
            world.removeObject(Air);
        }
        if(Greenfoot.isKeyDown("space")){
        getWorld().addObject(new Biji1(),486, 291);
        }
    }
}
