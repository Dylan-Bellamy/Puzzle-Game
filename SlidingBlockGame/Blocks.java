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
    int[] direction = {0,0,0,0};
    
    
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
     * 
     */
    public void Deselect(){
        if(this.state){
            if(Greenfoot.mouseClicked(this)){
                    state = false;
            }
        }
    }
    
    /** Method
     * 
     */
    public void imgBlocks(int me){
        setImage(blocks[me]);
        getImage().scale(195,195);
    }
    
    /** Method
     * 
     */
    public void act()
    {
        // Add your action code here.
        direction[0] = 0;
        direction[1] = 0;
        direction[2] = 0;
        direction[3] = 0;
        Selector();
        
        if(state == true){ // If mouse clicked on a block
            if(Greenfoot.isKeyDown("left")){ // If left arrow was pressed
            {setLocation(getX() - 200,getY());} // Set location left by 200
            // if (isAtEdge(getX(), getY() <= 600));
            state = false; // Reset state 
            direction[0] = 1;
            }
            
            if(Greenfoot.isKeyDown("right")){ // If right arrow was pressed
            {setLocation(getX() + 200,getY());} // Set location right by 200
            state = false; // Reset state 
            direction[1] = 1;
            }
            
            if(Greenfoot.isKeyDown("down")){ // If down arrow was pressed
            {setLocation(getX(),getY() + 200);} // Set location down by 200
            state = false; // Reset state 
            direction[2] = 1;
            }
            
            if(Greenfoot.isKeyDown("up")){ // If up arrow was pressed
            {setLocation(getX(),getY() - 200);} // Set location up by 200
            state = false; // Reset state 
            direction[3] = 1;
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
