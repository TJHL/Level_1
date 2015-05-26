import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Joke_Buttons implements ActionListener {
	public static void main(String[] args) {
		new Joke_Buttons().punch_line();
	}

	void punch_line() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.setText("Click me");
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println();
		JButton pressed = (JButton) arg0.getSource();
		System.out.println(pressed.getText());
		try {
			SwingUtilities.invokeLater(new Santa_emotions());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}