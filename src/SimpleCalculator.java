import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	public static void main(String[] args) {
		SimpleCalculator a = new SimpleCalculator();

	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField one = new JTextField(15);
	JTextField two = new JTextField(15);
	JButton button = new JButton("+");
	JButton buddon = new JButton("-");
	JButton bunnon = new JButton("*");
	JButton bummon = new JButton("/");
	JLabel label = new JLabel("88");

	public SimpleCalculator() {
		frame.add(panel);
		panel.add(one);
		panel.add(two);
		panel.add(button);
		panel.add(buddon);
		panel.add(bunnon);
		panel.add(bummon);
		panel.add(label);
		button.addActionListener(this);
		buddon.addActionListener(this);
		bunnon.addActionListener(this);
		bummon.addActionListener(this);
		frame.pack();
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		double a = Integer.parseInt(one.getText());
		double b = Integer.parseInt(two.getText());
		if (button == e.getSource()) {
			label.setText("" + (a + b));
			frame.pack();
		}
		if (buddon == e.getSource()) {
			a = Integer.parseInt(one.getText());
			b = Integer.parseInt(two.getText());
			label.setText("" + (a - b));
			frame.pack();

		}
		if (bunnon == e.getSource()) {
			a = Integer.parseInt(one.getText());
			b = Integer.parseInt(two.getText());
			label.setText("" + (a * b));
			frame.pack();

		}
		if (bummon == e.getSource()) {
			a = Integer.parseInt(one.getText());
			b = Integer.parseInt(two.getText());
			label.setText("" + (a / b));
			frame.pack();
			// if (bummon == e.getSource() && a == 0) {
			// System.exit(0);
			// }
			// if (bummon == e.getSource() && b == 0) {
			// System.exit(0);
			// }

		}

	}

}
