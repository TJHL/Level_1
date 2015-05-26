import javax.swing.JOptionPane;
public class Cat_Qestion {
public static void main(String [] args){
String A=JOptionPane.showInputDialog("How many cats do you have?");
int num = Integer.parseInt(A);
if (num>3){
JOptionPane.showMessageDialog(null, "YOU ARE OUT OF CONTROLL! YOU HAVE TOO MANY CATS!!!!!! SELL THEM ALL! SELL THEM ALL BEFORE THEY TAKE OVER THE WORLD!!!!!!!!!!!!!!!!!!!");}
else if (num<4){
JOptionPane.showMessageDialog(null, "Good.You are not out of controll.It's good that no one will die when they enter your house.");}
}
}
