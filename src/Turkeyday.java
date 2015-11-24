import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Turkeyday implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label;

	public static void main(String[] args) {
		Turkeyday hi = new Turkeyday();

	}

	Turkeyday() {
		String icon = "turkey-with-brown-hat.png";
		label = new JLabel(new ImageIcon(Turkeyday.class.getResource(icon)));
		panel.add(label);
		frame.add(panel);
		frame.addMouseListener(this);
		frame.setVisible(true);
		frame.pack();

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public void mouseClicked(MouseEvent e) {

		playSound("233123__jarredgibb__turkey-gobble-96khz.wav");
		JOptionPane.showMessageDialog(null, "Happy Turkey day");

	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}
}
