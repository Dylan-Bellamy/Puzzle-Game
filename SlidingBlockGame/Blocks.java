import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blocks extends Actor
{
    /**
     * Act - do whatever the Blocks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String[] blocks =  {"img1.png"}; // From MathPlaygrounds
    private boolean state = false;
    
    /** Method of selecting objects
     * @param state true if mouse is clicked, if not, false
     */    
    public void Selector(){
        if (state == false){
            if(Greenfoot.mouseClicked(this)){
                state = true;
            }
        }
    }
    
    /** Method of deselecting objects
     * @param not used b/c it breaks the code
     */
    public void Deselect(){
        if(this.state){
            if(Greenfoot.mouseClicked(this)){
                    state = false;
            }
        }
    }
    
    /** Method to set image scale of actor
     * @param me - used to scroll through a list of images / animation, but was never used
     */
    public void imgBlocks(int me){
        setImage(blocks[me]);
        getImage().scale(195,195);
    }
    
    /** Method public version of isTouching(Red.class) to be used in the world
     * 
     */
    public boolean touchingRed(){
        return isTouching(Red.class);
    }
    
    /** Method checks if mouse has clicked on a block and if pressed an arrow key and moves block accordling to arrow, but if an another object is in the way it brings back the block to it's original posistion 
     * 
     */
    public void act()
    {
        // Add your action code here.
        
        Selector();
        
        if(state == true){ // If mouse clicked on a block
            if(Greenfoot.isKeyDown("left")){ // If left arrow was pressed
                setLocation(getX() - 200,getY()); // Set location left by 200
                state = false; // Reset state 
                if (isTouching(Blocks.class)||touchingRed()){ // Touchs Block object 
                    setLocation(getX() + 200,getY()); // Move Back to original posistion
                }
                if (getX() == 0){
                    setLocation(getX() + 100,getY()); // Move Back to original posistion
                }
            }
            
            if(Greenfoot.isKeyDown("right")){ // If right arrow was pressed
            setLocation(getX() + 200,getY());// Set location right by 200
            state = false; // Reset state 
                if (isTouching(Blocks.class)||touchingRed()){ // Touchs Block object 
                    setLocation(getX() - 200,getY()); // Move Back to original posistion
                }
                if (getX() == 599){
                    setLocation(getX() - 100,getY()); // Move Back to original posistion
                }
            }
            
            if(Greenfoot.isKeyDown("down")){ // If down arrow was pressed
            setLocation(getX(),getY() + 200); // Set location down by 200
            state = false; // Reset state 
                if (isTouching(Blocks.class)||touchingRed()||getY() >= 700){ // Touchs Block object 
                    setLocation(getX(),getY() - 200); // Move Back to original posistion
                }
            }
            
            if(Greenfoot.isKeyDown("up")){ // If up arrow was pressed
            setLocation(getX(),getY() - 200); // Set location up by 200
            state = false; // Reset state 
                if (isTouching(Blocks.class)||touchingRed()){ // Touchs Block object 
                    setLocation(getX(),getY() + 200); // Move Back to original posistion
                }
                if (getY() == 0){
                    setLocation(getX(),getY() + 100); // Move Back to original posistion
                }
            }
            else{
                if(!Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("right")
                && Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("up")){
                    state = true;
                }
            }
        }
    }
    
    
}
