public class Dwarf {

	private String name;

	Dwarf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating a bright red apple");
	}

	public String getBeard() {
		if (name.equals("Dopey")) {
			return "Dopey does not have a beard";
		} else {
			return name + " has a beard";

		}
	}

	public String hasGlasses() {

		if (name.equals("Doc")) {
			return "Doc is the only one with glasses";
		} else {
			return name + " does not wear glasses";
		}

	}
}