import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprize implements ActionListener {

	public static void main(String[] args) {
		NastySuprize ns = new NastySuprize();
	}

	public NastySuprize() {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		JButton button = new JButton("Trick");
		JButton buddon = new JButton("Treat");
		button.addActionListener(this);
		buddon.addActionListener(this);
		frame.add(panel);
		panel.add(button);
		panel.add(buddon);
		frame.setVisible(true);
		frame.pack();
	}

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

}
