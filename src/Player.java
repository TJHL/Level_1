public class Player {

	private int health;
	int damage;
	int moveSpeed; // smaller numbers are faster
	int numofsupplies;

	public static void main(String[] args) {

		// Player bob = new Player(50, 10, 5, 5);
		Enemy cow = new Enemy("Cow");
		for (int i = 0; i < 1000; i++) {
			bob.regenHealth();
		}
		bob.eatApples(-2);
		cow.reportMyStatus();
		bob.attack(cow);
		cow.attack(bob);
		System.out.println(bob.health);

	}

	Player(int health, int damage, int moveSpeed, int numofsupplies) {
		this.health = health;
		this.damage = damage;
		this.moveSpeed = moveSpeed;
		this.numofsupplies = numofsupplies;
	}

	void regenHealth() {
		if (health <= 49) {
			health = health + 1;
			System.out.println(health);
		}
	}

	int gethealth() {

		return health;
	}

	void sethealth(int health) {
		this.health = health;
	}

	void eatfood(int numofsupplies) {
		if (health == health / 4 && numofsupplies > 0) {

			numofsupplies = numofsupplies - 1;
			health = health + 10;

			if (numofsupplies == 0) {

				System.out.println("You have ran out of qestionable healing items.");
			}
		} else {
			if (numofsupplies == 0) {
				System.out.println("Your screwed");
			}
		}
	}

	void attack(Enemy e) {

	}

}