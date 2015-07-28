import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;


public class GridWorld2 {
	
	public static void main(String[] args) {
		
		Bug fly = new Bug(Color.blue);
		Bug betle = new Bug();
		Flower dasiy=new Flower();
		Flower rose=new Flower();
		
		 Location roots=new Location (4,4);
		 Location point= new Location (3,7);
		 Location base= new Location (4,5);
		 Location pit= new Location(4,6);
 World map = new World();
 map.show ();
 
 map.add(point, betle );
 map.add(base, fly);
 map.add(roots, dasiy);
 map.add(pit, rose);
 fly.turn();
 fly.turn();
 
 
 
}
}