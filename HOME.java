import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HOME here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HOME extends Actor
{
    /**
     * Act - do whatever the HOME wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage image = new GreenfootImage("HOME.png");
        setImage(image);
        
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
