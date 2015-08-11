import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Fortue_cookie implements ActionListener{

	public static void main(String[] args) {
	
	
	Fortue_cookie cookie = new Fortue_cookie();	
	cookie.Showbutton();
	
	}
	
	
	
	public void Showbutton(){
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(200, 200);
	JButton button = new JButton();
	frame.add(button);
	button.addActionListener(this);
	System.out.println("Hello");	
	}



	
	public void actionPerformed(ActionEvent e) {
	int random= new Random().nextInt(5);
	
	if (random== 0){
		JOptionPane.showMessageDialog(null, "Valve, you made HL3. Its HL2ep1 and HL2ep2 put together! If its a '3' super stuition, just make it with 4 instead of '3'!");
	}
	if (random== 1){
		JOptionPane.showMessageDialog(null, "You will CS:GO by the end of the summer");
	}
	if (random== 2){
		JOptionPane.showMessageDialog(null, "DUCK!");
	}
	if (random== 3){
		JOptionPane.showMessageDialog(null, "You will fall asleep, not me.........eeejkdf   hnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
	}
	if (random== 4){
		JOptionPane.showMessageDialog(null, "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn AH!! I MADE 30 OF THESE! 30 FOURTUNES WITH JUST ''nnnnnnnnnnnnnnnnnnnnnnnnn''");
	}
	}
	
}
