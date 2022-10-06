import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;
/**
------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

GRADING: 
  I think this project deserves a level XXXX because ...

ADDED FEATURES:
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
    
    public MyWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        makeBlocks();
        
        Arrays.fill(places,0);
        
        int i = 0;
        while(i < 7){
            int rand1 = Greenfoot.getRandomNumber(3);
            int rand2 = Greenfoot.getRandomNumber(3);
            if(places[rand1 + rand2 * 3] != 1)
            {
                if(i == 6)
                {
                    addObject(new Mover((rand1 + 1) + ((rand2 + 0) * 3)),values[rand1] + 0,values2[rand2]);
                }
                else
                {
                    addObject(new Blocks(),values[rand1],values2[rand2]);
                }
                places[rand1 + rand2 * 3] = 1;
                i++;
            }
        }
    }
    
    public void makeBlocks(){
        int i = 0;
        while(i < 6)
        {
            
            i++;
        }
    }
}

