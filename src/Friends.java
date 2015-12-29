
public class Friends {
	public static void main(String[] WHATDOSEARGSEVENSTANDFOR) {
		new Friends().getgoing();
	}

	private void getgoing() {

		Boy billy = new Boy("billy", 15, false);
		Boy billy_clone = new Boy("billy#2", 13, true);
		Boy billy_clone_two = new Boy("billy#3", 13, true);
		Boy billy_clone_three = new Boy("billy#4", 13, true);
		Boy billy_clone_four = new Boy("billy#5", 13, true);
		billy_clone.cry();
		billy_clone_two.cry();
		billy_clone_three.cry();
		billy_clone_four.cry();

	}

	public class Boy {
		String name;
		int age;

		public Boy(String name, int age, boolean clone) {
			System.out.println("His name is " + name + ", and is " + age + " years old.");
			if (clone) {
				System.out.println(name + " is a clone and is depressed because of it ");

			}
		}

		private void cry() {
			System.out.println("Billy is crying.");
		}
	}

}
