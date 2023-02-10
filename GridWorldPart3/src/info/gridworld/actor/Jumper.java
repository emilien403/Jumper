
	package info.gridworld.actor;

	import info.gridworld.grid.Grid;
	import info.gridworld.grid.Location;

	import java.awt.Color;

	/**
	 * A <code>Bug</code> is an actor that can move and turn. It drops flowers as
	 * it moves. <br />
	 * The implementation of this class is testable on the AP CS A and AB exams.
	 */
	public class Jumper extends Actor
	{
		private int waitCounter;
	    /**
	     * Constructs a jumper.
	     */
	    public Jumper()
	    {
	    	
	    }

	    /**
	     * Constructs a jumper of a given color.
	     * @param bugColor the color for this jumper
	     */
	    public Jumper(Color bugColor)
	    {
	    	
	    }

	    /**
	     * Moves if it can move
	     */
	    public void act()
	    {
	    	
	    }

	    /**
	     * Turns the jumper 90 degrees to the right without changing its location.
	     */
	    public void turn()
	    {
	    	
	    }

	    /**
	     * Moves the jumper forward two spots forward and can jump over obstacles
	     */
	    public void move()
	    {
	    	
	    }
	    
	    /**
	     * Moves the jumper to the other side of the grid if the bug moves out the grid
	     */
	    public void wrapAround()
	    {
	    	
	    }
	    
	    /**
	     * Increases the wait counter by 1
	     */
	    public void waitTime() 
	    {
	    	
	    }
	    
	    /**
	     * Checks and returns the number of obstacles in front of the jumper
	     * @return the number of obstacles in front of the jumper
	     */
	    public int checkObstacles() {
	    	return 0;
	    }
	    
	    /**
	     * Tests whether this jumper can move forward into a location that is empty
	     * 
	     * @return true if this jumper can move.
	     */
	    public boolean canMove()
	    {
	    	return false;
	    }
	}
