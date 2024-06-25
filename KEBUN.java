import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KEBUN here.
 */
public class KEBUN extends World
{
    /**
     * Constructor for objects of class KEBUN.
     */
    public KEBUN()
    {    
        // Create a new world with 780x480 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
        prepare();
    }
    
    private void prepare()
    {
        showText("LEVEL 1", 400, 40);
        KARAKTER karakter = new KARAKTER();
        addObject(karakter, 550, 300);
    }
    
    public void act()
    {
        // Check and add ANGGUR
        if (Greenfoot.getRandomNumber(600) < 2) {
            addObject(new ANGGUR(), Greenfoot.getRandomNumber(780), 0);
        }
        
        // Check and add MANGGA
        if (Greenfoot.getRandomNumber(500) < 1) {
            addObject(new MANGGA(), Greenfoot.getRandomNumber(780), 0);
        }
        
        // Check and add JERUK
        if (Greenfoot.getRandomNumber(700) < 2) {
            addObject(new JERUK(), Greenfoot.getRandomNumber(780), 0);
        }
        
        // Check and add APEL
        if (Greenfoot.getRandomNumber(600) < 1) {
            addObject(new APEL(), Greenfoot.getRandomNumber(780), 0);
        }
        
        // Check and add BOM
        if (Greenfoot.getRandomNumber(400) < 1) {
            addObject(new BOM(), Greenfoot.getRandomNumber(780), 0);
        }
    }
}
