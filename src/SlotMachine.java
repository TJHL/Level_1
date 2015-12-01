import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panle = new JPanel();
	JPanel panIe = new JPanel();
	JLabel lable = new JLabel();
	JLabel label = new JLabel();
	JLabel labie = new JLabel();
	JButton button = new JButton("SPIN!");

	public static void main(String[] args) {
		SlotMachine slotmachine = new SlotMachine();

	}

	SlotMachine() {
		frame.add(panIe);
		frame.add(panel);
		frame.add(panle);
		GridLayout manager = new GridLayout();
		frame.setLayout(manager);
		spinwheel(1);
		spinwheel(2);
		spinwheel(3);
		panIe.add(button);
		panel.add(lable);
		panle.add(label);
		panIe.add(labie);
		button.addActionListener(this);
		frame.setVisible(true);
		frame.pack();

	}

	void spinwheel(int wheel) {
		Random r = new Random();
		int value = r.nextInt(10);
		if (wheel == 1) {
			lable.setText(" " + value);
		}
		if (wheel == 2) {
			label.setText(" " + value);
		}
		if (wheel == 3) {
			labie.setText(" " + value);

		}

	}

	public void actionPerformed(ActionEvent e) {
		spinwheel(1);
		spinwheel(2);
		spinwheel(3);

	}

}
