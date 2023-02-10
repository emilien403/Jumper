package testers.a;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Jumper;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

/**
 * Tests to see what happens if the Jumper is facing the edge of the grid
 * @author rbodke226
 */

public class RunnerA {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Jumper jumper = new Jumper();
		world.add(jumper);
		jumper.moveTo(new Location(3,4));
		jumper.setDirection(90);
		Rock rock = new Rock();
		world.add(rock);
		rock.moveTo(new Location(3,6));

		
		world.show();
	}

}
