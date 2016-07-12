import javax.swing.JFrame;

public class TeaParty {
	String a;
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		TeaParty party = new TeaParty();
		System.out.println(party.welcome("bob", false, true));

	}

	public String welcome(String lastName, boolean isWoman, boolean isKnighted) {
		if (isKnighted == false && isWoman == true) {
			a = "Ms.";
		}
		if (isKnighted == false && isWoman == false) {
			a = "Mr.";
		}
		if (isKnighted == true && isWoman == false) {
			a = "Sir ";
		}
		if (isKnighted == true && isWoman == true) {
			a = "Dame ";
		}
		return ("Hello " + a + lastName);
	}
}