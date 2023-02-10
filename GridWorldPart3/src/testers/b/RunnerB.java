package testers.b;

// Author: Ajay Naik

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Jumper;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

// Test if the jumper is at the edge
public class RunnerB {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Jumper jump = new Jumper();
		jump.setDirection(Location.NORTH);
		// Before
		world.add(new Location(1, 2), jump);
		
		world.show();
	}

}
