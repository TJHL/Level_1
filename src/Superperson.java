public class Superperson {
	private String superpower;

	String getsuperpower() {
		return this.superpower;
	}

	void setsuperpower(String superpower) {
		this.superpower = superpower;
	}

	private String name;
	String getname() {
		return this.name;
	}

	void setname(String name) {
		this.name = name;
	}

	private int yearborn;
	int getyearborn() {
		return this.yearborn;
	}

	void setyearborn(int yearborn) {
		this.yearborn = yearborn;
	}
	public String toString()
	{
		return ""+name+"has the superpower of "+ superpower+ "and was born in "+ yearborn ;
	}

}
