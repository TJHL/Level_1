public class Friends_2 {
	public static void main(String[] args) {
		Classmate Joey = new Classmate();
		Classmate Drew = new Classmate();
		Classmate Kanvar = new Classmate();
		Classmate Sherlin = new Classmate();
		Classmate Melissa = new Classmate();

		Kanvar.setdescription("Should die in a fire");
		Joey.setdescription("Should die in a fire");
		Drew.setdescription("Is going to michigan apparently.");
		Sherlin.setdescription("Comes to class with Melissa");
		Melissa.setdescription("Was listening to music");
		System.out.println(Drew.getdescription());
		System.out.println(Kanvar.getdescription());
		System.out.println(Joey.getdescription());
		System.out.println(Sherlin.getdescription());
		System.out.println(Melissa.getdescription());
	}

}

class Classmate {
	String description;

	public void setdescription(String description) {
		this.description = description;

	}

	public String getdescription() {
		return description;
	}
}
