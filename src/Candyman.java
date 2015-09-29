import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Candyman implements ActionListener {
	int a = 0;

	Candyman() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("PRESS ME IF YOU DARE");
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		frame.setVisible(true);
		frame.pack();

	}

	public static void main(String[] args) {
		Candyman man = new Candyman();
	}

	// To summon the Candyman, say his name 5 times in the mirror.
	// Create a user interface that has a single button labeled “Candyman”.

	// When the user presses it 5 times, show them a scary picture from the
	// internet using the method below.

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	// And also play a SCARY or CREEPY sound.

	static final int CREEPY = 0;
	static final int SCREAM = 1;

	public static void playSound(int whichSound) {
		File soundFile = null;
		if (whichSound == CREEPY)
			soundFile = new File(
					"/Users/Guest/Google Drive/league-sounds/creepy-noise.wav");
		else if (whichSound == SCREAM)
			soundFile = new File(
					"/Users/Guest/Google Drive/league-sounds/scream.wav");
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		a++;
		if (a == 5) {

		}

	}
}