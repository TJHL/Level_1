import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextChanger implements ActionListener {
	String color;
	JButton button = new JButton("Orange");
	JButton buddon = new JButton("Blue");
	JButton bubbon = new JButton("Green");
	JLabel label = new JLabel("I don't want my color to change!");
	int question;

	public static void main(String[] args) {
		TextChanger textchanger = new TextChanger();
	}

	TextChanger() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button);
		panel.add(buddon);
		panel.add(bubbon);
		panel.add(label);
		button.addActionListener(this);
		buddon.addActionListener(this);
		bubbon.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (question == 0) {

			if (buttonPressed == button) {
				label.setForeground(Color.ORANGE);

			}
			if (buttonPressed == buddon) {
				label.setForeground(Color.BLUE);
			}
			if (buttonPressed == bubbon) {
				label.setForeground(Color.GREEN);
			}
			button.setText("Black");
			buddon.setText("Red");
			bubbon.setText("Green");
		}
		if (question == 1) {
			label.setOpaque(true);
			label.setText("No, it's bad enough!");
			if (buttonPressed == button) {
				label.setBackground(Color.BLACK);

			}
			if (buttonPressed == buddon) {
				label.setBackground(Color.RED);
			}
			if (buttonPressed == bubbon) {
				label.setBackground(Color.GREEN);
			}

		}
		question++;
	}
}