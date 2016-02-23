
public class DwarfRunner {
	public static void main(String[] args) {
		Dwarf Sleepy = new Dwarf("Sleepy");
		Dwarf Dopey = new Dwarf("Dopey");
		Dwarf Doc = new Dwarf("Doc");
		Sleepy.eat();
		System.out.println(Sleepy.getName());
		System.out.println(Dopey.getBeard());
		System.out.println(Dopey.hasGlasses());
		System.out.println(Doc.getBeard());
		System.out.println(Doc.hasGlasses());

	}

}
