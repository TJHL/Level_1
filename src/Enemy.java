public class Enemy {

	private int health;
	int damage;
	int moveSpeed; // smaller numbers are faster
	String type;

	public static void main(String[] args) {
		Enemy cow = new Enemy("Sheep");
		// System.out.println(cow.type);
		// System.out.println(cow.health);
		// System.out.println(cow.damage);
		// System.out.println(cow.moveSpeed);

		Enemy wolf = new Enemy("Wolf");
		// System.out.println(wolf.type);
		// System.out.println(wolf.health);
		// System.out.println(wolf.damage);
		// System.out.println(wolf.moveSpeed);

		// for (int i = 4; i > 0; i--) {
		// int a = cow.attack(wolf);
		// System.out.println(wolf.health);
		// }
		for (int i = 0; i < 1000; i++) {
			if (i % cow.moveSpeed == 0) {
				cow.attack(wolf);
				boolean b = wolf.isAlive();
				if (b == false) {
					System.out.println("Enemy wolf has \"fainted\"");
					break;
				}
				System.out.println("The wolf health is: " + wolf.health);

			}
			if (i % wolf.moveSpeed == 0) {
				wolf.attack(cow);
				boolean c = cow.isAlive();
				if (c == false) {
					System.out.println("Enemy cow has \"fainted\"");
					break;
				}
				System.out.println("The cow health is: " + cow.health);
			}
		}

	}

	Enemy(String type) {
		this.type = type;
		if (type == "Cow") {
			this.health = 50;
			this.damage = 5;
			this.moveSpeed = 10;
		}
		if (type == "Sheep") {
			this.health = 80;
			this.damage = 15;
			this.moveSpeed = 50;
		}
		if (type == "Wolf") {
			this.health = 20;
			this.damage = 2;
			this.moveSpeed = 1;
		}
	}

	int attack(Enemy target) {
		int damageDealt;
		damageDealt = damage;
		// System.out.println(damageDealt);
		target.health -= damageDealt;
		return damageDealt;
	}

	boolean isAlive() {
		if (this.health <= 0) {
			return false;
		} else {
			return true;
		}

	}
}