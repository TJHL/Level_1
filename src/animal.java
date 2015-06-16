public class animal {

	public String name;
	public int age;
	public static void main(String[] args) {
		animal creature= new animal( "The one who ate it's nametag.", 2) ;
		creature.atack();
		creature.getname();
		creature.getage();
		creature.setname("The one who ate it's nametag.");
		creature.setage(2);
	}
	animal (String name, int age){
		this.name=name;
		this.age=age;
		}
	String getname(){
		return name;
	}
	
	int getage(){
		return age;
	}
	
	void setname (String name)
	{this.name=name;}
	
	void setage (int age)
	{this.age=age;}
	
	void atack(){
		System.out.println("Atack method: 'This is the infamos- AW JESUS ITS OUT OF ITS CAGE!!!! F***ING RUN EVERYBODY, RUUUUUUUUUUU-CHOMP-");
	}
}