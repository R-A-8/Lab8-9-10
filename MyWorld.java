import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 768, 1); 

        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; //seems to be the default
        prepare();
    }

    public void act(){
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS)/ 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }
     public double getTimeStepDuration(){
         return timeStepDuration;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CannonBall cannonBall = new CannonBall();
        addObject(cannonBall,654,267);
        CannonBall cannonBall2 = new CannonBall();
        addObject(cannonBall2,304,209);
        CannonBall cannonBall3 = new CannonBall();
        addObject(cannonBall3,898,114);
        CannonBall cannonBall4 = new CannonBall();
        addObject(cannonBall4,472,556);
        removeObject(cannonBall2);
        removeObject(cannonBall4);
        removeObject(cannonBall);
        removeObject(cannonBall3);
        Cannon cannon = new Cannon();
        addObject(cannon,294,411);
        Target target = new Target();
        addObject(target,477,101);
        Target target2 = new Target();
        addObject(target2,679,225);
        Target target3 = new Target();
        addObject(target3,772,429);
        Target target4 = new Target();
        addObject(target4,592,591);
        target2.setLocation(632,209);
        target3.setLocation(762,320);
        target4.setLocation(853,547);
        target3.setLocation(774,344);
        target2.setLocation(620,182);
    }
}
