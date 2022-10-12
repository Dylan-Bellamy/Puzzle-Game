import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Border here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Border extends Actor
{
    /**
     * Act - do whatever the Border wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String[] border =  {"img3.png"}; // From MathPlaygrounds
    
    /** Method to set image scale of actor
     * @param me - used to scroll through a list of images / animation, but was never used
     */
    public void imgBorder(int me){
        setImage(border[me]);
        getImage().scale(200,60);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
