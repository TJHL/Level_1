import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot2 {
	public static void main(String[] args) {
		Spamalot2 hi = new Spamalot2();
		hi.f();
	}

	void f() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JButton buddon = new JButton();
		JTextField text = new JTextField();
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		panel.add(buddon);
		frame.pack();
		frame.setVisible(true);
	}
}
