import java.awt.GridLayout;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HEHE {
	public HEHE() {

		JPanel panel = new JPanel();
		JPanel pamel = new JPanel();
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout());
		JButton button = new JButton("Cancel");
		JButton buddon = new JButton("Add Helper");
		String imagetop = "imagepart.png";
		JLabel imagepart = null;
		try {
			imagepart = createImage(imagetop);
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
		panel.add(imagepart);
		frame.add(panel);
		frame.add(pamel);
		panel.add(button);
		pamel.add(buddon);
		frame.setVisible(true);

		frame.setSize(443, 243);
		frame.pack();

	}

	public static void main(String[] args) {
		HEHE hehe = new HEHE();
	}

	private JLabel createImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}
