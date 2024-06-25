import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KEBUN3 here.
 */
public class KEBUN3 extends World
{
    /**
     * Constructor for objects of class KEBUN3.
     */
    public KEBUN3()
    {    
        // Create a new world with 780x480 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
        prepare();
    }

    public void act(){
        if(Greenfoot.getRandomNumber(60) < 2){
            addObject(new APEL(), Greenfoot.getRandomNumber(780), 0);
        }
        if(Greenfoot.getRandomNumber(50) < 1){
            addObject(new ANGGUR(), Greenfoot.getRandomNumber(780), 0);
        }
        if(Greenfoot.getRandomNumber(50) < 2){
            addObject(new MANGGA(), Greenfoot.getRandomNumber(780), 0);
        }
        if(Greenfoot.getRandomNumber(60) < 2){
            addObject(new JERUK(), Greenfoot.getRandomNumber(780), 0);
        }
        if(Greenfoot.getRandomNumber(400) < 1){
            addObject(new BOM(), Greenfoot.getRandomNumber(780), 0);
        }
    }

    private void prepare()
    {
        showText("LEVEL 3", 400, 40);
        KARAKTER karakter = new KARAKTER();
        addObject(karakter, 550, 300);
    }
}
