import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PLAY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PLAY extends Actor
{
    /**
     * Act - do whatever the PLAY wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this))
            Greenfoot.setWorld(new RUANGTUNGGU());
    
    }
}
