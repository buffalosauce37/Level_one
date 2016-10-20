import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Colors;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;


public class Gridworld {

	/**
	 * Figure out how to get the World to show.
	 *  Figure out how to add a Bug to
	 * the world (clue: you will need the Bug and Location objects) 
	 * Add another bug at a random location in the world. 
	 * Change the color of that bug to
	 * blue. 
	 * Make the bug face to the right.
	 *  Add flowers to the left and right
	 * of the bug. 
	 * Fill the whole world with flowers!
	 * @throws InterruptedException 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
World earth = new World();
earth.show();

int random2 = new Random().nextInt(10);
int random3 = new Random().nextInt(10);
int random4 = new Random().nextInt(10);

Location america = new Location(3,3);
for (int j = 0; j < 10; j++) {
	for (int i = 0; i < 10; i++) {
		Flower faze = new Flower(Colors.getRandomColor());
		Location germany = new Location(j,i);
		earth.add(germany, faze);
		int random1 = new Random().nextInt(5000);
		Thread.sleep(random1);
	}
}
//
//Flower faze = new Flower();
//Location germany = new Location(3,4);
//earth.add(germany, faze);
//Flower faze1 = new Flower();
//Location germany2 = new Location(4,3);
//earth.add(germany2, faze1);
//Flower harambe = new Flower();
//earth.add(america, harambe);
//Location canada = new Location(4,4);
//Flower pepe = new Flower();
//earth.add(canada, pepe);
//Location canada2 = new Location(1,1);
//Flower pepe2 = new Flower();
//earth.add(canada2, pepe2);
//Location canada3 = new Location(1,2);
//Flower pepe3 = new Flower();
//earth.add(canada, pepe);
//harambe.setColor(Color.CYAN);


	}
}
