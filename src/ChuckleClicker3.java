import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker3 implements ActionListener {
	public static void main(String[] args) {
		ChuckleClicker3 joke = new ChuckleClicker3();
		joke.makeButtons();

	}

	JButton button;
	JButton buddon;

	void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		button = new JButton("Joke");
		buddon = new JButton("Punch line");
		frame.add(panel);
		panel.add(button);
		panel.add(buddon);
		button.addActionListener(this);
		buddon.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button) {
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
		}
		if (arg0.getSource() == buddon) {
			JOptionPane.showMessageDialog(null, "I don't know, he got turned into roadkill before he told me.");
		}

	}
}
