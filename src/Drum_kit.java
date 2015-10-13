// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Drum_kit extends MouseAdapter {
	JLabel drumImage;

	public static void main(String[] args) throws Exception {
		new Drum_kit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setTitle("Click me for unlimited money");
		JPanel panel = new JPanel();
		frame.add(panel);
		String Drum_top = "Drum top.jpg";
		drumImage = createImage(Drum_top);
		panel.add(drumImage);
		new GridLayout();
		frame.pack();
		drumImage.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {

		System.out.println("mouse clicked");
		JLabel drumClicked = (JLabel) e.getSource();

		if (drumClicked == drumImage) {

			playSound("drum kit 1 - 1:12:15, 7.42 PM.aif");
		}

	}

	private JLabel createImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
