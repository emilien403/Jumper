package testers.c;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Jumper;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

/**
 * Tests to see what happens if the Jumper is facing the edge of the grid
 * @author bbbbbrian
 */

public class RunnerC {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Jumper jumper1 = new Jumper();
		world.add(jumper1);
		jumper1.moveTo(new Location(0,4));
		Jumper jumper2 = new Jumper();
		world.add(jumper2);
		jumper2.moveTo(new Location(4,0));
		jumper2.setDirection(-90);
		
		world.show();
	}

}
