

import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Celebertybodyblabla {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/tobylaskowski/Desktop/download.jpeg";
	String secondImage = "/Users/tobylaskowski/Desktop/Screen Shot 2014-12-15 at 6.48.22 PM";
	//String thirdImage = "/pathtofile/example3.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		window.setSize(100,100);
		// Make an int variable to hold the score.
		int Score = 0 ;
		// Ask the user who this person is and store their answer
		String answer =JOptionPane.showInputDialog("Who is this?");
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
		if( answer.equals("Notch") ){
			JOptionPane.showMessageDialog(null, "Correct! Plus 1 point");
			Score = Score + 1 ;
			}
			
		
		// Otherwise:
		// -- Tell them they are wrong
		else{
			JOptionPane.showMessageDialog(null, "You lost.");
		}
		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
		showNextImage();
		JOptionPane.showMessageDialog(null, "Your score is " +Score);
		
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		Celebertybodyblabla quiz = new Celebertybodyblabla();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		//imageLabel = loadImage(thirdImage);
		//imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}

