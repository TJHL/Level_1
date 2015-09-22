import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Sensitivekeyboard implements KeyListener {
	public static void main(String[] args) {
		Sensitivekeyboard key = new Sensitivekeyboard();
	}

	public Sensitivekeyboard() {
		JFrame frame = new JFrame();
		frame.addKeyListener(this);
		frame.show(true);
	}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {

	}

	public void keyReleased(KeyEvent e) {
		System.out.println("ouch key pressed");
		speak("like me, Dick Clark is dead");
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
