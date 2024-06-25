import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class APEL extends Actor
{
    private int speed;

    public APEL() {
        speed = 2;  // Increased speed for level 3
    }

    public void act() 
    {
        setLocation(getX(), getY() + speed);

        if (isTouching(KARAKTER.class)) {
            removeAndScore();
            return;
        }

        if (isAtEdge()) {
            getWorld().removeObject(this);
            return;
        }
    }

    private void removeAndScore() {
        getWorld().removeObject(this);
        SKOR.jumlah_skor += 5;
        Greenfoot.playSound("petikbuah.wav");
    }
}
