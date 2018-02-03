import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dino2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlyDino extends Actor
{
    /**
     * Act - do whatever the Horse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int v=0;
    public int g=1;
    public int timerAnimation=5;
    public int Animaturn=0;
    int speed = 6;
    public int RandomSpeedo = Greenfoot.getRandomNumber(5);
    /**
     * Act - do whatever the Kangaroo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    
    {   movingPicture();
        if (getX()<-10){
            getWorld().removeObject(this);}
        move(-RandomSpeedo);// Add your action code here.
       
    
      int X = getX();
      int Y = getY();
      X -= speed;
      if(isAtEdge() && X < 9 ){
          getWorld().removeObject(this);
         
      }
      setLocation( X, Y);
    } 
    private void movingPicture(){
            timerAnimation--;
            if (timerAnimation==0&&Animaturn==0){
                setImage("Fly-Dino-0.png");
                timerAnimation=5;
                Animaturn=1;
            }
            if (timerAnimation==0&&Animaturn==1){
                setImage("Fly-Dino-1.png");
                timerAnimation=5;
                Animaturn=2;
            }
            if (timerAnimation==0&&Animaturn==2){
                setImage("Fly-Dino-2.png");
                timerAnimation=5;
                Animaturn=3;
            }
            if (timerAnimation==0&&Animaturn==3){
                setImage("Fly-Dino-3.png");
                timerAnimation=5;
                Animaturn=4;
            }
            if (timerAnimation==0&&Animaturn==4){
                setImage("Fly-Dino-4.png");
                timerAnimation=5;
                Animaturn=5;
            }
            if (timerAnimation==0&&Animaturn==5){
                setImage("Fly-Dino-5.png");
                timerAnimation=5;
                Animaturn=6;
            }
            if (timerAnimation==0&&Animaturn==6){
                setImage("Fly-Dino-6.png");
                timerAnimation=5;
                Animaturn=7;
            }
            if (timerAnimation==0&&Animaturn==7){
                setImage("Fly-Dino-7.png");
                timerAnimation=5;
                Animaturn=8;
            }
            if (timerAnimation==0&&Animaturn==8){
                setImage("Fly-Dino-8.png");
                timerAnimation=5;
                Animaturn=9;
            }
            if (timerAnimation==0&&Animaturn==9){
                setImage("Fly-Dino-9.png");
                timerAnimation=5;
                Animaturn=10;
            }
            if (timerAnimation==0&&Animaturn==10){
                setImage("Fly-Dino-10.png");
                timerAnimation=5;
                Animaturn=0;
            }
             
        
    }
}
