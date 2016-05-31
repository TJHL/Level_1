import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	public static void main(String[] args) {
		BinaryConverter thing = new BinaryConverter();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField input = new JTextField(20);
	JTextField output = new JTextField(20);
	JButton button = new JButton("Convert");

	String A;
	String B;

	BinaryConverter() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(input);
		panel.add(button);
		panel.add(output);
		button.addActionListener(this);
		frame.pack();
	}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 numbers");
			return 0;
		}
		if (!Pattern.matches("[01]{8}", binary)) {
			JOptionPane.showMessageDialog(null, "Enter 1's and Zeros.");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter Binary");
			// question.setText("Hi");
			return 0;
		}
	}

	public void actionPerformed(ActionEvent e) {
		A = input.getText();
		output.setText(convert(A));

	}

}