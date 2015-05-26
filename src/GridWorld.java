import java.awt.Color;
import java.util.Random;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.gui.*;
import info.gridworld.world.*;

public class GridWorld {

	public static void main(String[] args) {
		World seed=new World();
		
		seed.show();
		
		Bug herobrine =new Bug();
		
		Location cave=new Location(9,9);
		
		seed.add(cave, herobrine);
		
		Bug feesh =new Bug();
		
		int x =new Random().nextInt(10);
		
		int y =new Random().nextInt(10);
		
		Location village=new Location(y,x);
		
		seed.add(village, feesh);
		
		feesh.setColor(Color.BLUE);
		
		feesh.turn();
		feesh.turn();
		
		Flower rose=new Flower();
		
		Flower poppy=new Flower();
		
		Location floating=new Location(y,x-1);
		
		Location blocks=new Location(y,x+1);
		 
		seed.add(floating, rose);
		rose.setColor(Color.RED);
		seed.add(blocks, poppy);
		poppy.setColor(Color.RED);
		
		
	}


}
/*
8. Fill the whole world with flowers!
*9. [Optional] Color the flowers in rows like the American flag (red & white)
*/