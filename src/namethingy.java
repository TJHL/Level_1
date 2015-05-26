import javax.swing.JOptionPane;


public class namethingy {
	public static void main(String[] args){
		String B = JOptionPane.showInputDialog("Whats your name?");
		String A = JOptionPane.showInputDialog("Whats your age?");
		 int num = Integer.parseInt(A);
		if(num > 13){
		JOptionPane.showMessageDialog(null,"You were born before 2000 " +B );}
		else if(num < 4){
		JOptionPane.showMessageDialog(null, "How the **** are you using this program? Get out. Get lost");}
		
		else{
		JOptionPane.showMessageDialog(null, "We should be frends, "+ B);}
	}
		
		
		
		
	}


