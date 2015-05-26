import java.net.URI;

import javax.swing.JOptionPane;

public class soundtrack_thingy_that_i_dont_care_about {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("what kind of mood make you use this crapy peice of #### on a crapy peice of #### website?");
		if (a .equalsIgnoreCase("happy")) {
		playVideo("https://www.youtube.com/watch?v=pAgnJDJN4VA");}
		if (a.equalsIgnoreCase("sad")) {
		playVideo("http://www.youtube.com/watch?v=C9haTFoGcvk");}
		if (a .equalsIgnoreCase("angry")) {
			playVideo("http://www.youtube.com/watch?v=TZMoS2QBc8U");}
			if (a.equalsIgnoreCase("mad")) {
			playVideo("http://www.youtube.com/watch?v=icJ67ABPbRs");}
		
		
		
		
		// If you are seeing ads at the beginning of your videos, install Adblock.
		
	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
 
