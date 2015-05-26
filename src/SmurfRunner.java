import javax.swing.JOptionPane;


public class SmurfRunner {

	public static void main(String[] args) {
		
	
		Smurf Handy = new Smurf ("Handy");
		
		Handy.eat();
		
		System.out.println(Handy.getName());
		
		Smurf Papa = new Smurf ("Papa");
		System.out.println(Papa.getName());
		
		Papa.getHatColor();
		System.out.println("Papa Smurf's hat is "+Papa.getHatColor());
		
		Papa.isGirlOrBoy();
		System.out.println("Papa Smurf is a "+Papa.isGirlOrBoy());
		
		Smurf Smurfette = new Smurf ("Smurfette");
		System.out.println(Smurfette.getName());
		
		Smurfette.getHatColor();
		System.out.println("Smurfette Smurf's hat is "+Smurfette.getHatColor());
		
		Smurfette.isGirlOrBoy();
		System.out.println("Smurfette Smurf is a "+Smurfette.isGirlOrBoy());
	
	}
	

}
