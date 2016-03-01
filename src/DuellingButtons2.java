import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuellingButtons2 implements ActionListener {

	public static void main(String[] args) {
		new DuellingButtons2().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	JButton middleButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		// 1. Add the panel to the frame
		frame.add(panel);
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
		leftButton.setText("Click me!");
		// 4. Set the text of the rightButton to "Click me!"
		rightButton.setText("Click me!");
		// 5. Add an action listener to the leftButton
		leftButton.addActionListener(this);
		// 6. Add an action listener to the rightButton
		rightButton.addActionListener(this);
		// 7. Add the leftButton to the panel
		panel.add(leftButton);
		panel.add(middleButton);
		// 8. Add the rightButton to the panel
		panel.add(rightButton);
		// 9. Pack the frame
		frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Demanding Buttons");

		middleButton.setText("Click me!");
		middleButton.addActionListener(this);
		frame.pack();

	}

	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		/* If the buttonPressed was the leftButton.... */
		if (buttonPressed == leftButton) {
			rightButton.setText("No, click me!");
			rightButton.setPreferredSize(BIG);
			middleButton.setText("No, click me!");
			middleButton.setPreferredSize(BIG);
			leftButton.setText("Click me again!");
			leftButton.setPreferredSize(SMALL);
		}
		if (buttonPressed == rightButton) {
			leftButton.setText("No, click me!");
			leftButton.setPreferredSize(BIG);
			middleButton.setText("No, click me!");
			middleButton.setPreferredSize(BIG);
			rightButton.setText("Click me again!");
			rightButton.setPreferredSize(SMALL);
		}
		if (buttonPressed == middleButton) {
			leftButton.setText("No, click me!");
			leftButton.setPreferredSize(BIG);
			middleButton.setText("Click me again!");
			middleButton.setPreferredSize(SMALL);
			rightButton.setText("No, click me!");
			rightButton.setPreferredSize(BIG);
		}
		frame.pack();
	}
	// Set the text of the rightButton to "No, click Me!"
	// Set the PREFERRED size of the rightButton to BIG
	// Set the text of the leftButton to "Click Me!"
	// Set the PREFERRED size of the leftButton to SMALL

	/* If the buttonPressed was the rightButton, do the opposite. */

}
