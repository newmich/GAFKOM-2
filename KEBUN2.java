import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KEBUN2 here.
 */
public class KEBUN2 extends World
{
    /**
     * Constructor for objects of class KEBUN2.
     */
    public KEBUN2()
    {    
        // Create a new world with 780x480 cells with a cell size of 1x1 pixels.
        super(780, 480, 1); 
        prepare();
    }

    public void act(){
        if(Greenfoot.getRandomNumber(600) < 4){
            addObject(new APEL(), Greenfoot.getRandomNumber(780), 0);
        }
        if(Greenfoot.getRandomNumber(500) < 4){
            addObject(new ANGGUR(), Greenfoot.getRandomNumber(780), 0);
        }
        if(Greenfoot.getRandomNumber(400) < 2){
            addObject(new MANGGA(), Greenfoot.getRandomNumber(780), 0);
        }
        if(Greenfoot.getRandomNumber(700) < 2){
            addObject(new JERUK(), Greenfoot.getRandomNumber(780), 0);
        }
        if(Greenfoot.getRandomNumber(750) < 1){
            addObject(new BOM(), Greenfoot.getRandomNumber(780), 0);
        }
    }

    private void prepare()
    {
        showText("LEVEL 2", 400, 40);
        KARAKTER karakter = new KARAKTER();
        addObject(karakter, 550, 300);
    }
}
