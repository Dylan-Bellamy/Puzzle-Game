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
    private String[] red =  {"img2.png"}; // From MathPlaygrounds
    
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
    public Red(int me){ 
        setImage(red[me]);
        getImage().scale(390,195);
    }
    
    /**
     * Method checks if mouse has clicked on a red and if pressed an arrow key and moves red accordling to arrow, but if an another object is in the way it brings back the Red to it's original posistion
     */    
    public void act()
    {
        // Setting up Variables
        
        Selector();
        
        if(getX() == 200 && getY() == 700){
                    System.out.println("Winner");
                    getWorld().showText("Game Over", 300, 425);
                    getWorld().showText("You Won", 300, 475);
                    Greenfoot.stop();
        }
        
        if(state == true){ // If mouse clicked on a block
            if(Greenfoot.isKeyDown("left")){ // If left arrow was pressed
                setLocation(getX() - 200,getY()); // Set location left by 200
                state = false; // Reset state 
                if (isTouching(Blocks.class)){ // Touchs Block object 
                    setLocation(getX() + 200,getY()); // Move Back to original posistion
                }
                if (getX() == 0){
                    setLocation(getX() + 200,getY()); // Move Back to original posistion
                }
            }
            
            if(Greenfoot.isKeyDown("right")){ // If right arrow was pressed
            setLocation(getX() + 200,getY());// Set location right by 200
            state = false; // Reset state 
                if (isTouching(Blocks.class)){ // Touchs Block object 
                    setLocation(getX() - 200,getY()); // Move Back to original posistion
                }
                if (getX() == 599){
                    setLocation(getX() - 200,getY()); // Move Back to original posistion
                }
            }
            
            if(Greenfoot.isKeyDown("down")){ // If down arrow was pressed
            setLocation(getX(),getY() + 200); // Set location down by 200
            state = false; // Reset state 
                if (isTouching(Blocks.class)||getX() >= 299 && getY() >= 700||getY() >= 900){ // Touchs Block object 
                    setLocation(getX(),getY() - 200); // Move Back to original posistion
                }
            }
            
            if(Greenfoot.isKeyDown("up")){ // If up arrow was pressed
            setLocation(getX(),getY() - 200); // Set location up by 200
            state = false; // Reset state 
            
                if (isTouching(Blocks.class)){ // Touchs Block object 
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
