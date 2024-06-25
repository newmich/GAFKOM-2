import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BOM extends Actor
{
    private int speed;

    public BOM() {
        speed = 8;  // Increased speed for level 3
    }

    public void act() 
    {
        setLocation(getX(), getY() + speed);

        if (isTouching(KARAKTER.class)) {
            removeAndDecreaseHealth();
            return;
        }

        if (isAtEdge()) {
            getWorld().removeObject(this);
            return;
        }
    }

    private void removeAndDecreaseHealth() {
        getWorld().removeObject(this);
        NYAWA.nyawa_berkurang();  // Decrease health (implement this method accordingly)
    }
}
