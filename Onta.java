import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Onta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Onta extends Actor
{
    /**
     * Act - do whatever the Onta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int Kecepatan = 0;
    public int Gravitasi = 1;
    public int score = 0;
    public GameOver GameOver;
    
    public void act() 
    {
      Kecepatan ++ ;   
      setLocation(getX(), getY()+Kecepatan);
      if (Greenfoot.isKeyDown("up")){
        Kecepatan = -10;
        
    }
      if (getY() > 411){
        Kecepatan = -1;
        setLocation(getX(),411);
    }
    if (Greenfoot.isKeyDown("right")){
        move(3);
    }
    if (Greenfoot.isKeyDown("left")){
        move(-3);
    }
    if(isTouching(Cactus.class)){
      Greenfoot.stop();
      getWorld().addObject(new Over(),450, 225);
      //getWorld().addObject(lose,getWorld().getHeight()/2,getWorld().getWidth()/2);
    }
    }

}
