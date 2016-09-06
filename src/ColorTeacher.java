import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton yellbutton = new JButton();
	JButton redbutton = new JButton();
	JButton bluebutton = new JButton();
	JButton greenbutton = new JButton();

	ColorTeacher() {

		frame.add(panel);
		panel.add(yellbutton);
		panel.add(redbutton);
		panel.add(bluebutton);
		panel.add(greenbutton);
		yellbutton.setBackground(Color.yellow);
		yellbutton.setOpaque(true);
		yellbutton.addActionListener(this);
		redbutton.setBackground(Color.red);
		redbutton.setOpaque(true);
		redbutton.addActionListener(this);
		bluebutton.setBackground(Color.blue);
		bluebutton.setOpaque(true);
		bluebutton.addActionListener(this);
		greenbutton.setBackground(Color.green);
		greenbutton.setOpaque(true);
		greenbutton.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		ColorTeacher ta = new ColorTeacher();
	}

	public void actionPerformed(ActionEvent arg0) {
		System.out.println(arg0);
	}

	void speak(String words) {
		System.out.println(words);
		try {
			Runtime.getRuntime().exec("say" + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
