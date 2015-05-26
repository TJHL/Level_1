import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		/*
		 * 1. Use the dance method to make the Tortoise spin.
		 
		  
		 * 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		 * that number of times.
		 */
		Tortoise.setPenColor(Color.WHITE);
		String d = JOptionPane.showInputDialog("How many times do you think the tortise should dance?");
		int D = Integer.parseInt(d);
		dance(D);
		d = JOptionPane.showInputDialog("How many times do you think the tortise should dance?");
		if(D > 19){
		Tortoise.move(250);
		Tortoise.turn(180);
		Tortoise.move(250);
		d = JOptionPane.showInputDialog("How many times do you think the tortise should dance?");
		}
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}

