import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameEnd extends Actor
{
    /**
     * Act - do whatever the GameEnd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GameEnd(){
        setImage(new GreenfootImage("Your Score is : "+MyWorld.points, 35, null, null));
    }
        
}
