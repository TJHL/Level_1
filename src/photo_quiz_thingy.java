import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class photo_quiz_thingy {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		int Score = 0;
		String A = "http://img1.wikia.nocookie.net/__cb20130621084906/uberstrike/images/d/d5/SPAS_12.jpg";
		Component box;
		box = createImage("http://img1.wikia.nocookie.net/__cb20130621084906/uberstrike/images/d/d5/SPAS_12.jpg");
		quizWindow.add(box);
		quizWindow.pack();
		String B = JOptionPane.showInputDialog("Is this a Spas-12?");
		if (B.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Correct");
			Score = Score + 1;
		}
		if (B.equals("no")) {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}

		quizWindow.remove(box);
		box = createImage("http://www.gunblast.com/images/Butch_M19/686-PP.jpg");
		quizWindow.add(box);
		quizWindow.pack();
		String C = JOptionPane
				.showInputDialog("What caliber is this gun? 50 or 357.");
		if (C.equals(".357")) {
			JOptionPane.showMessageDialog(null, "Correct");
			Score = Score + 1;
		}
		if (C.equals("50")) {
			JOptionPane.showMessageDialog(null, "Incorrect");
			
			if (C.equals("357")) {
				JOptionPane.showMessageDialog(null, "Incorrect");
		}
		quizWindow.remove(box);
		JOptionPane.showMessageDialog(null, "Your score is " + Score + " .You owe me " + Score + " dollars.");
		quizWindow.setVisible(false);}

	}

	private static Component createImage(String imageUrl)
			throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

}
