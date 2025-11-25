import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SimulationWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimulationWorld extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;

    /**
     * Constructor for objects of class SimulationWorld.
     * 
     */
    public SimulationWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; //seems to be the default
        
    }
    
    public void act(){
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS)/ 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }
    
     public double getTimeStepDuration(){
         return timeStepDuration;
    }
    
    
}
