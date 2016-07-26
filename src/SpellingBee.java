import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class SpellingBee {
	int score = 0;
	int lines;
	ArrayList<String> words = new ArrayList<>();

	/*
	 * If the user spells it right move on to a new word, but if they do not
	 * spell it right ask again. The only place that you need to write code in
	 * is the stuffForYouToDo() Method
	 */
	public void stuffForYouToDo() {
		String word = randomWord();
		Speak(word);
		String a = JOptionPane.showInputDialog("Spell the word.");
		if (a.equals(word)) {
			System.out.println("Good job!");
			stuffForYouToDo();
		}
		if (!a.equals(word)) {
			System.out.println("You suck");
			score = score + 1;
			if (score >= 2) {
				System.exit(0);
			}
			stuffForYouToDo();
		}

	}

	public String randomWord() {
		return words.get(new Random().nextInt(lines));
	}

	public SpellingBee() {
		System.out.println(" /--------------------------------------------\\ ");
		System.out.println(" | Warning: Some of the words are super hard! | ");
		System.out.println(" \\--------------------------------------------/ ");
		try {
			// Get the amount of lines
			LineNumberReader lnr = new LineNumberReader(new FileReader(new File("/usr/share/dict/words")));
			lnr.skip(Long.MAX_VALUE);// Skip to the end
			lines = lnr.getLineNumber();// Get last line number
			lnr.close();
			BufferedReader br = new BufferedReader(new FileReader(new File("/usr/share/dict/words")));
			for (int i = 0; i < lines; i++) {
				words.add(br.readLine()); // adds every line to the array
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		stuffForYouToDo();
	}

	public static void main(String[] args) {
		new SpellingBee();
	}

	public void Speak(String text) {
		try {
			Runtime.getRuntime().exec("say " + text).waitFor();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}

	public void speakNoWait(String text) {
		try {
			Runtime.getRuntime().exec("say " + text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}