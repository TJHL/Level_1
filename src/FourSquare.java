
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare {
	public static void main(String[] args) {
		// 3. Make the tortoise move as fast as possible
		Tortoise.setSpeed(10);
		// 4. Set the pen width to 5
		Tortoise.setPenWidth(5);
		// 5. Do the following 4 times...
			for (int A = 0; A < 4; A++) {
				
			
			// 6. Change the color of the line the Tortoise draws to a random color 
			//	Tortoise.setPenColor(color);
			// 1. Call the drawSquare() method
			drawSquare();
			// 7. Turn the tortoise 90 degrees to the right
			Tortoise.turn(90);
			}
	}

	/* 2. Fill in the code to draw a square inside the method below. */
	static void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		Tortoise.move(100);
		
		
	}
}




