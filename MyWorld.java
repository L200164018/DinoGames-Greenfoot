import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int Timer = 15;
    private ScoreBoards scoreBoard = null;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 450, 1, true); 
        //addObject(new Onta(), 80, 410);
        addObject(new Dino(), 80, 390);
        //addObject(new Cactus(), 500, 500);
        //addObject (new Counter(), 650, 55);
        scoreBoard = new ScoreBoards();
        addObject(scoreBoard, 70, 50);
        
    }
    public void act() {
        addCactusppd();
    }
    private void addCactusppd() {
        Timer--;
        if (Timer == 0) {
            int randomnumber = Greenfoot.getRandomNumber(50);
            if (randomnumber > 25){
                addObject(new Cactus(),900, 410);
                Timer = Greenfoot.getRandomNumber(30)+80;
            }
            else{
                addObject(new FlyDino(),900, 210);
                Timer = Greenfoot.getRandomNumber(20)+40;
            }
        }
    }
   /*public void setScore(int score) {
        scoreBoard.setScore(score);
    }*/
}

