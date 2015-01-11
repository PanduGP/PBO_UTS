import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dunia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dunia extends World
{   
    public Dunia()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        counter();
        prepare();
        
    }
    private void counter()
    {
        /*int totalair=0;
        Actor Biji;
        if (totalair==2)
        {   removeObject(Biji);
        }*/
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        /*Score.count=0;
        score = new Score();
        addObject(score, 490, 380);*/
        Papan ppn = new Papan();
        addObject(ppn, 500, 600);
        Air air = new Air();
        addObject(air, 489,0);
        Matahari matahari = new Matahari();
        addObject(matahari, 266, 62);
        Biji biji = new Biji();
        addObject(biji, 486, 291);
     }
}
