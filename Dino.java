import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Dino extends Actor
{
    /**
     * Act - do whatever the Horse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int v=0;
    public int g=1;
    public int timerAnimation=5;
    public int Animaturn=0;
    private int xx =5;   
    /**
     * Act - do whatever the Kangaroo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movingPicture();
        if (getY()== 390){
        if (Greenfoot.isKeyDown("up")==true)
        {
            v=-22;
        }
        if (Greenfoot.isKeyDown("right")==true)
        {
           move(5);
        }
        if (Greenfoot.isKeyDown("left")==true)
        {
            move(-5);
        }
    }
        v=v+g;
        setLocation(getX(),getY()+v);
        if (getY()>390)
        {
            v=0;setLocation(getX(),390);       
        }
        if(isTouching(Cactus.class)|| isTouching(FlyDino.class)){
            Greenfoot.stop();
            getWorld().addObject(new Over(),450, 225);
        }
        if (getOneIntersectingObject(Cactus.class) != null) {
               //GameOver gameOver = new GameOver();
               //getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
               //Greenfoot.playSound("Die.wav");
               //Greenfoot.stop();
            }
           if (getOneIntersectingObject(Cactus.class) != null) {
               //GameOver gameOver = new GameOver();
               //getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
               //Greenfoot.playSound("Die.wav");
               //Greenfoot.stop();
            }
        }
    private void movingPicture(){
            timerAnimation--;
            if (timerAnimation==0&&Animaturn==0){
                setImage("dino2-0.png");
                timerAnimation=5;
                Animaturn=1;
            }
            if (timerAnimation==0&&Animaturn==1){
                setImage("dino2-1.png");
                timerAnimation=5;
                Animaturn=2;
            }
            if (timerAnimation==0&&Animaturn==2){
                setImage("dino2-2.png");
                timerAnimation=5;
                Animaturn=3;
            }
            if (timerAnimation==0&&Animaturn==3){
                setImage("dino2-3.png");
                timerAnimation=5;
                Animaturn=4;
            }
            if (timerAnimation==0&&Animaturn==4){
                setImage("dino2-4.png");
                timerAnimation=5;
                Animaturn=5;
            }
            if (timerAnimation==0&&Animaturn==5){
                setImage("dino2-5.png");
                timerAnimation=5;
                Animaturn=6;
            }
            if (timerAnimation==0&&Animaturn==6){
                setImage("dino2-6.png");
                timerAnimation=5;
                Animaturn=7;
            }
            if (timerAnimation==0&&Animaturn==7){
                setImage("dino2-7.png");
                timerAnimation=5;
                Animaturn=8;
            }
            if (timerAnimation==0&&Animaturn==8){
                setImage("dino2-8.png");
                timerAnimation=5;
                Animaturn=9;
            }
            if (timerAnimation==0&&Animaturn==9){
                setImage("dino2-9.png");
                timerAnimation=5;
                Animaturn=10;
            }
            if (timerAnimation==0&&Animaturn==10){
                setImage("dino2-10.png");
                timerAnimation=5;
                Animaturn=11;
            }
            if (timerAnimation==0&&Animaturn==11){
                setImage("dino2-11.png");
                timerAnimation=5;
                Animaturn=0;
            }
      
        
    }
}