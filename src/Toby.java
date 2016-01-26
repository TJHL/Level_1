import javax.swing.JOptionPane;

public class Toby {
	String tOby = "Toby";
	int myage = 13;
	String birthmonth = "July";

	int compareAge(int anotherAge) {
		return myage - anotherAge;
	}

	boolean isMyBirthMonth(String month) {
		if (birthmonth.equals(month)) {
			return true;
		}
		return false;
	}

	public String gettOby() {
		return tOby;
	}

	public static void main(String[] args) {
		Toby run = new Toby();
		int difference = run.compareAge(13);
		System.out.println(difference);
		boolean issamebirthmonth = run.isMyBirthMonth("May");
		boolean issamebirthMonth = run.isMyBirthMonth("July");
		System.out.println(issamebirthmonth);
		System.out.println(issamebirthMonth);
		JOptionPane.showInputDialog("Hello, my name is Toby. What is yours?");
		JOptionPane.showInputDialog("Oh, thats a stupid name in my opinion. How old are you?");

	}
}