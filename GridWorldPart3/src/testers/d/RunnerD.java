package testers.d;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Jumper;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;


/**
 * Tests to see what happens if actor and jumper try to move to the same spot
 * @author clarahinds
 */
public class RunnerD {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Jumper jumper = new Jumper();
		jumper.setDirection(Location.EAST);
		world.add(new Location(0, 0), jumper);
		
		Actor actor = new Actor();
		world.add(new Location(0,1), actor);
		
		world.show();
	}

}
