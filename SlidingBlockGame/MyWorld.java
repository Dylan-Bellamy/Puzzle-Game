import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;
/**
------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Sliding Block Game
PURPOSE OF PROJECT: Puzzle Game
VERSION or DATE: 2022-10-12
HOW TO START THIS PROJECT:
AUTHORS: Dylan Bellamy
USER INSTRUCTIONS: Left click on your mouse on a block and then use the 
arrow keys to move the block, your goal is to get the red block under the 
border to win. Note, you can not stack blocks on each other.

GRADING: 
  I think this project deserves a level 4+ because it utilizes mouse and 
  keyboard move more or one blocks at the same time if it's possible. It
  uses clean and nice block collision and border detection to stop blocks
  from stacking up on each other which would be make the game to easy.

ADDED FEATURES:
- Object Selecting via Mouse
- Movement using Keyboard
- End Screen (Nothing special)
*/

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int[] values = {100,300,500};
    private int[] values2 = {100,300,500};
    private int[] places = new int[9];
    //int count;
    
    public MyWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 900, 1); 
        
        makeBlocks();
        
        Arrays.fill(places,0);
                
        int i = 0;
        while(i < 6){
            int rand1 = Greenfoot.getRandomNumber(3);
            int rand2 = Greenfoot.getRandomNumber(3);
            
            Border tempBorder = new Border();
            tempBorder.imgBorder(0);
            addObject(tempBorder, 505, 635);
            if(places[rand1 + rand2 * 3] != 1)
            {
                if(i == 0)
                {   
                    addObject(new Red(0),values[2] - 100 ,values2[0]);
                }
                else
                {
                    Blocks tempBlock = new Blocks();
                    tempBlock.imgBlocks(0);
                    addObject(tempBlock,values[rand1],values2[rand2]);
                    if(tempBlock.touchingRed()){
                        this.removeObject(tempBlock);
                        i--;
                    }
                }
                places[rand1 + rand2 * 3] = 1;
                i++;
            }
        }
    }
    
    public void makeBlocks(){
        int i = 0;
        while(i < 6) // if i is less than 6
        {
            i++; // increase i value by 1
        }
    }
    
    //public void counter(){
        //if(Greenfoot.isKeyDown(this)){
        //    count++;
       // }
    //}
}


