import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

// 1. Create a frame & make it visible
JFrame bob = new JFrame();
bob.setVisible(true);
		// 2. Add the panel to the frame
		bob.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle 

// 5. Add the turtle to the panel 
	for (int i = 0; i < 50 ; i++) {
		Turtle jerry = new Turtle();
		panel.addTurtle(jerry);
int random = new Random().nextInt(1000);
int x =new Random().nextInt(500);
jerry.setX(random);
jerry.setY(x+300);
	}

		
		// 6. Put 50 Turtles on the beach

	}
}

