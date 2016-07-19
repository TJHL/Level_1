import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Ducks");
	JButton buddon = new JButton("Frog");
	JButton budon = new JButton("FluffyUnicorns");
	JButton buton = new JButton("Random");

	public CutenessTV() {
		frame.add(panel);
		panel.add(button);
		panel.add(buddon);
		panel.add(budon);
		panel.add(buton);
		button.addActionListener(this);
		buddon.addActionListener(this);
		budon.addActionListener(this);
		buton.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		CutenessTV hi = new CutenessTV();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			showDucks();
		}
		if (e.getSource() == buddon) {
			showFrog();
		}
		if (e.getSource() == budon) {
			showFluffyUnicorns();
		}
		if (e.getSource() == buton) {
			Random rand = new Random();
			int n = rand.nextInt(3);
			if (n == 0) {
				showDucks();
			}
			if (n == 1) {
				showFrog();
			}
			if (n == 2) {
				showFluffyUnicorns();
			}

		}

	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
