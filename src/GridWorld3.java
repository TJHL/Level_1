import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld3 {

	public static void main(String[] args) {
		World seed = new World();

		seed.show();

		Bug herobrine = new Bug();

		int x2 = new Random().nextInt(10);

		int y2 = new Random().nextInt(10);

		Location cave = new Location(y2, x2);

		seed.add(cave, herobrine);

		Bug feesh = new Bug();

		int x = new Random().nextInt(10);

		int y = new Random().nextInt(10);

		Location village = new Location(y, x);

		seed.add(village, feesh);

		feesh.setColor(Color.BLUE);

		feesh.turn();
		feesh.turn();

		Flower rose = new Flower();

		Flower poppy = new Flower();

		Location floating = new Location(y, x - 1);

		Location blocks = new Location(y, x + 1);

		seed.add(floating, rose);
		rose.setColor(Color.RED);
		seed.add(blocks, poppy);
		poppy.setColor(Color.RED);

	}

}