import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TRYAGAIN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TRYAGAIN extends Actor
{
    /**
     * Act - do whatever the TRYAGAIN wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            NYAWA.jumlah_nyawa = 5;
            SKOR.jumlah_skor = 0;
            Greenfoot.delay(2);
                Greenfoot.setWorld(new KEBUN());
        }
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
        }
    }
}
