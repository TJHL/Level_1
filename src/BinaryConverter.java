import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
We’re going to make an application that converts binary codes (8-bits) into letters.
You’ll need a JFrame and a JPanel.
On the panel, put two text fields and a button. A text field is made like this:
JTextField answer = new JTextField(20);
It may look like this or you might have a better layout in mind.
 */

public class BinaryConverter { 
	public static void main(String[] args) {
		BinaryConverter thing =new BinaryConverter();	
	}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField input = new JTextField(20);
JTextField output = new JTextField(20);
JButton button = new JButton();

BinaryConverter (){
frame.setVisible(true);
frame.add(panel);
panel.add(input);
panel.add(button);
button.
panel.add(output);
frame.pack();
}
	
	int convert(String binary) {
			if(binary.length() != 8){
				JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
				return 0;
			}
			 if(!Pattern.matches("\2", binary)) {
				 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
					return 0;
			 }
			try {
				int asciiValue = Integer.parseInt(binary, 2);
				return asciiValue;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
				//question.setText("");
				return 0;
			}
		}


}