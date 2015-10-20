import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typingtutor {
	char currentLetter;
	JFrame frame = new JFrame("STOP WASTING MY TIME YOU PESANT!!!!!!!!!!!!");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	public Typingtutor() {
		frame.add(panel);
		frame.add(label);
		frame.setVisible(true);
		frame.pack();
	}

	public static void main(String[] args) {

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

}
