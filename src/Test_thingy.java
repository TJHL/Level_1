import javax.swing.JOptionPane;


public class Test_thingy {
	public static void main(String[] args){
	String A = JOptionPane.showInputDialog("How old are you?");
	int B = Integer.parseInt(A);
	if(B>17){
		JOptionPane.showInputDialog("Who should be the next President?");}
	if(B<18){
	JOptionPane.showMessageDialog(null, "We don't care. Go play Ninja kiwi.");}	
	}
	}

