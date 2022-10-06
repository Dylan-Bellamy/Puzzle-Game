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
    private String[] blocks =  {"img1.png","img2.png"}; // From MathPlaygrounds
    private boolean state = false;
    //int moveBlock = 9;
    int[] direction = {0,0,0,0};

    //int blockX, blockY;
    
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
    
    public void imgBlocks(int me){
        setImage(blocks[me]);
        getImage().scale(195,195);
    }
    
    public void act()
    {
        // Add your action code here.
        direction[0] = 0;
        direction[1] = 0;
        direction[2] = 0;
        direction[3] = 0;
        Selector();
        if(state == true){
            if(Greenfoot.isKeyDown("left")){
            {setLocation(getX() - 200,getY());}
            state = false;
            direction[0] = 1;
            }
            
            if(Greenfoot.isKeyDown("right")){
            {setLocation(getX() + 200,getY());}
            state = false;
            direction[1] = 1;
            }
            
            if(Greenfoot.isKeyDown("down")){
            {setLocation(getX(),getY() + 200);}
            state = false;
            direction[2] = 1;
            }
            
            if(Greenfoot.isKeyDown("up")){
            {setLocation(getX(),getY() - 200);}
            state = false;
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
