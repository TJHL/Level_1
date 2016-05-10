import java.awt.Color;
import java.awt.Font;
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
	JFrame frame;
	int question;

	public static void main(String[] args) {
		TextChanger textchanger = new TextChanger();
		System.out.println("hi");
	}

	public TextChanger() {
		frame = new JFrame();
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
			button.setText("Times New Roman");
			buddon.setText("Helvetica");
			bubbon.setText("Comic Sans MS");
			frame.pack();
		}
		if (question == 2) {
			label.setOpaque(true);
			label.setText("FINE!!! THE WIFI PASSWORD IS : code4life");
			if (buttonPressed == button) {
				label.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			}
			if (buttonPressed == buddon) {
				label.setFont(new Font("Helvetica", Font.PLAIN, 12));
			}
			if (buttonPressed == bubbon) {
				label.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
			}
			frame.pack();
		}

		if (question >= 3) {
			label.setOpaque(true);
			label.setText(
					"NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
							+ "OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
			if (buttonPressed == button) {
				label.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			}
			if (buttonPressed == buddon) {
				label.setFont(new Font("Helvetica", Font.PLAIN, 12));
			}
			if (buttonPressed == bubbon) {
				label.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
			}
			frame.pack();
		}
		question++;
	}
}