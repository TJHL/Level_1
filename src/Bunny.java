public class Bunny {
	int legs;
	String food_lot;

	public Bunny(int legs, String food_lot) {
		this.legs = legs;
		this.food_lot = food_lot;
	}

	void hop() {
		System.out.println("The bunny was energised so it jumped around a little bit");
	}

	void foot() {
		System.out.println("He found a fresh, just made lucky rabbits foot.");
	}
}