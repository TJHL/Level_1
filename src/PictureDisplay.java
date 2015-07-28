import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;

public class PictureDisplay implements ActionListener {

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	JPanel panel = new JPanel();

	/* We’re going to make Buttons that show cool Pictures */

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame bigframe = new JFrame();
	// 5. create two variables of type "JLabel" but don’t initialize them
	 JLabel BigLabel;
	 JLabel SmallLable;
	private void makeAlbum() {
		// 2. Make the frame visible
		bigframe.setVisible(true);
		// 3. find 2 images and save them to your disk
		// 4. make a variable. make it hold the location of your image. e.g. “illusion.jpg”
		String Popcorn = "POPCORNNNNN!!!!.jpeg";
		String Icecream = "ICCEEECREAMMMMMMMMM!!!!!!!!!.jpg";
		// 6. use one of the the "loadImage..." methods below to initialize your JLabel
		BigLabel= loadImageFromComputer(Popcorn);
		SmallLable=loadImageFromComputer(Icecream);
		// 7. add a action listener ("this") to your Right Button and set the Text of your button
		rightButton.addActionListener(this);
		rightButton.setText("The seccond button");
		// 8. add an action Listener (“this”) to the Left Button and set the Text of your button
		leftButton.addActionListener(this);
		leftButton.setText("The first button");
		// 9. Add the leftButton to the panel
		
		// 10. Add the rightButton to the panel
		
		// 11. add the Panel to the JFrame
		
		// 12. Pack the Frame
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		// 13. remove both labels from the frame
		// 14. load one label to the JFrame
		// 15. pack the frame
/* If the buttonPressed was the rightButton....*/

/* If the buttonPressed was the rightButton....*/
		// 16. remove both labels from the frame 
		// 17. load other label to the JFrame
		// 18. pack the frame
	}

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public static void main(String[] args) throws Exception {
		new PictureDisplay().makeAlbum();
	}
}



