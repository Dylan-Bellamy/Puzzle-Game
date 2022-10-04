import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mover extends Actor

{
    /**
     * Act - do whatever the Mover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean state = false;
    int moveBlock = 9;
    int[] direction = {0,0,0,0};

    int blockX, blockY;
    
    public void Selector(){
        if (state == false){
            if(Greenfoot.mouseClicked(this)){
                state = true;
            }
        }
    }
    
    public void Deselect(){
        if(this.state){
            if(Greenfoot.mouseClicked(this)){
                    state = false;
            }
        }
    }
    
    public Mover(int isMoveBlock){
        moveBlock = isMoveBlock;
    }
    
    protected void addedToWorld(World world)
    {
       blockX = getX();
       blockY = getY();
    }
 
    public void isClicked()
    {
       if (Greenfoot.mouseClicked(null))
       {
           MouseInfo mouse = Greenfoot.getMouseInfo();
           blockX = mouse.getX();
           blockY = mouse.getY();
       }
    }
    
    public void act()
    {
        // Setting up Variables
        direction[0] = 0;
        direction[1] = 0;
        direction[2] = 0;
        direction[3] = 0;
        
        if(state == true){
        
        
        }
    }
}
