import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnimalJumping {
	public static void main(String[] args) throws MalformedURLException {
		String urlOfAnimalSuckingAtJumping = "http://i.imgur.com/Jdt1rRf.gif";
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JLabel imagelabel = createImage(urlOfAnimalSuckingAtJumping);
		frame.add(imagelabel);
		frame.pack();

	}

	static JLabel createImage(String imageURL) throws MalformedURLException {
		URL url = new URL(imageURL);
		Icon icon = new ImageIcon(url);
		return new JLabel(icon);
	}
}
