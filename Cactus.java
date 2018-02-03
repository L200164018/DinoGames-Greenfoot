import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus extends Actor
{
    int speed = 6;
   
    /**
     * Act - do whatever the cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      int X = getX();
      int Y = getY();
      X -= speed;
      if(isAtEdge() && X < 9 ){
          getWorld().removeObject(this);
         
      }
      setLocation( X, Y);
    }    
}
