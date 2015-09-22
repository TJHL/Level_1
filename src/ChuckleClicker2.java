import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ChuckleClicker2 implements ActionListener {
 
JButton button;	
JButton buddon;	
public static void main(String[] args){
	ChuckleClicker joke = new ChuckleClicker();
	joke.makeButtons();
}
void makeButtons(){
	JFrame frame= new JFrame();
	frame.setVisible(true);
	JPanel panel =new JPanel();
	 button = new JButton();
	 buddon = new JButton();
	button.setText("Joke");
	buddon.setText("Punchline");
	button.addActionListener(this);
	buddon.addActionListener(this);
	panel.add(button);
	panel.add(buddon);
	frame.add(panel);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource() == button){
	JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");}
	if(arg0.getSource() == buddon){
	JOptionPane.showMessageDialog(null, "I don't know, he got turned into roadkill before he told me.");}
	
}
}