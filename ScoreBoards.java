import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoards extends Actor
{
    private GreenfootImage background;
    private int min;
    private int max;
    private String prefix;
    private int set;
    public ScoreBoards()
    {
        this(new String("Score :  "));
    }
    
    public ScoreBoards(String prefix)
    {
        background = getImage();  // get image from class
        min = 0;
        max = 1000000;
        this.prefix = prefix;
        updateImage();
    }
    
    public void act() 
    {
        if (min < max) {
            set++;
            min = set/10;
           
                min+=1;   
                updateImage();
           
        }
        else if (min > max) {
            min--;
            updateImage();
        }
    }

    public void add(int score)
    {
        max += score;
    }

    public int getValue()
    {
        return max;
    }

    /**
     * Set a new counter value.  This will not animate the counter.
     */
    public void setValue(int newValue)
    {
        max = newValue;
        min = newValue;
        updateImage();
    }
    
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + min, 22, Color.WHITE, new Color(0,0,0,0));
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
