import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WhackAMole {

	WhackAMole() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JButton buddon = new JButton();
		JButton bubbon = new JButton();
		JButton butdon = new JButton();
		JButton butbon = new JButton();
		JButton buton = new JButton();
		JLabel label = new JLabel();

		frame.add(panel);
		panel.add(button);
		panel.add(buddon);
		panel.add(bubbon);
		panel.add(butdon);
		panel.add(butbon);
		panel.add(buton);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);

	}
}
