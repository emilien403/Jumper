package testers.f;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Jumper;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;


public class RunnerF{

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Jumper jumper = new Jumper();
		world.add(jumper);
		jumper.moveTo(new Location(4,2));
		jumper.setDirection(90);
		Rock rock1 = new Rock();
		world.add(rock1);
		rock1.moveTo(new Location(4,3));
		Rock rock2 = new Rock();
		world.add(rock2);
		rock2.moveTo(new Location(4,4));
		world.show();
	}

}
