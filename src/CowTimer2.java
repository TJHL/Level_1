import java.applet.AudioClip;
import java.io.IOException;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class CowTimer2 {
	/*
	 * This is an advanced recipe. There may be more than one line of code for
	 * each instruction.
	 */

	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
		CowTimer2 beef = new CowTimer2();
		String input = JOptionPane.showInputDialog("How Many Seconds?");
		int inputint = Integer.parseInt(input);
		beef.setTime(inputint);
		beef.start();
        
	}

	private int seconds;

	public void setTime(int time) {
		System.out.println(time);
		this.seconds = time;
		System.out.println("You have set the cow timer for "+ time + " seconds.");
		
	}

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for 60
		 * seconds using Thread.sleep(int milliseconds).
		 */
		for (int a = seconds; a > -1; a--) {
			System.out.println(a+" seconds remaining.");
			seconds =  a ;
			Thread.sleep(1000);
		}
		
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo
		 * sound. You can download one from freesound.org, then drag it into
		 * your default package. Tell the students (by speaking) it's time to walk.
		 */
		if ( seconds == 0 ) {
			playSound("84697__cmusounddesign__moo.wav");
			speak("Time for a walk");
	}
	}
	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}

