import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Red extends Actor

{
    /**
     * Act - do whatever the Mover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean state = false;
    int moveBlock = 9;
    int[] direction = {0,0,0,0};
    private String[] red =  {"img2.png"};
    
    
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
    
    public Red(int isMoveBlock, int me){ 
        moveBlock = isMoveBlock;
        setImage(red[me]);
        getImage().scale(390,195);
    }
    
        
    public void act()
    {
        // Setting up Variables
        direction[0] = 0;
        direction[1] = 0;
        direction[2] = 0;
        direction[3] = 0;
        Selector();
        Actor collided = getOneIntersectingObject(Blocks.class);
        
        if(state == true){ // If mouse clicked on a block
            if(Greenfoot.isKeyDown("left") && (collided == null)){ // If left arrow was pressed
                {setLocation(getX() - 200,getY());} // Set location left by 200
                state = false; // Reset state 
                direction[0] = 1;
            if(collided != null){
                state = false; // Reset state
            }
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
