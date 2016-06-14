import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton;

	private JPanel quizPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		frame.setVisible(true);
		frame.setTitle("Jeoprady");
		JPanel topic = new JPanel();
		topic = createHeader("Tanks and aviation");
		quizPanel.add(topic);
		frame.add(quizPanel);
		firstButton = createButton("300");
		quizPanel.add(firstButton);
		secondButton = createButton("600");
		quizPanel.add(secondButton);
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		// 12. Fill in the actionPerformed() method below

		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * 13. Add buttons so that you have $200, $400, $600, $800 and $1000
	 * questions
	 * 
	 * [optional] Use the showImage or playSound methods when the user answers a
	 * question [optional] Add new topics for the quiz
	 */

	private JButton createButton(String dollarAmount) {
		JButton button = new JButton();
		button.setText(dollarAmount);
		buttonCount = buttonCount + 1;
		return button;
	}

	public void actionPerformed(ActionEvent arg0) {
		// Use the method that plays the jeopardy theme music.
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == firstButton) {
			askQuestion("A High Explosive Anti-Tank shell", "What is a HEAT shell", 300);
			firstButton.setText(null);
		}
		if (buttonPressed == secondButton) {
			askQuestion(
					"This American plane had four 20mm cannons, and was the original version of one of the most succsesfull plane of WW2",
					"What is the P-51", 600);
			secondButton.setText(null);
		}
		// Call the askQuestionRecipe with a harder question

		// Clear the button text (set the button text to nothing)

	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		String A = JOptionPane.showInputDialog(question);
		if (A.equals(correctAnswer)) {
			score = score + prizeMoney;
			updateScore();
			JOptionPane.showMessageDialog(null, "YOUR RIGHT");
		}
		if (!(A.equals(correctAnswer))) {
			score = score - prizeMoney;
			JOptionPane.showMessageDialog(null, "NO!");
			updateScore();
		}
	}

	public void playJeopardyTheme() {
		try {
			// audioInputStream = AudioSystem.getAudioInputStream(new
			// URL("http://school.wintrisstech.org/sounds/jeopardy.wav"));
			// Clip clip = AudioSystem.getClip();
			// .open(audioInputStream);
			// clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}