/*
* 1. In a Runner class, make Spongebob. Use the methods below to make him eat, and print his name
*
* 4. Make 2 more characters from the spongebob world and print their name, job, and house shape
*/

public class SeaCreature{
 public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("spongebob");
	SeaCreature a_minority_charicter = new SeaCreature("a minority charicter");
	SeaCreature patric = new SeaCreature("patric");
	System.out.println(spongebob.getName());
	spongebob.eat();
	spongebob.getJob();
	spongebob.getHouseShape();
	System.out.println(a_minority_charicter.getName());
	a_minority_charicter.eat();
	a_minority_charicter.getJob();
	a_minority_charicter.getHouseShape();
	System.out.println(patric.getName());
	patric.eat();
	patric.getJob();
	patric.getHouseShape();
	
}
          	private String name;
 
          	SeaCreature(String name){
                       	this.name = name;
          	}
          	
          	public String getName(){
          	return "My name is " + name;
          	}
 
          	public void eat(){
                       	System.out.println(name + " is eating krabby patties");
          	}
 
          	public void getJob(){
                       	// 2. Fill in this method
          		if (name.equals ("spongebob")){
          		System.out.println(name + " works at the crusty crab");
                }
          		if (name.equals ("a minority charicter")){
              		System.out.println(name + ", we really dont know its job.");
                 }
          		if (name.equals ("patric")){
              		System.out.println(name + "is unemployed. (we think)");
                    }
}
 
public void getHouseShape(){
          		// 3. Fill in this method
	if (name.equals ("spongebob")){
  		System.out.println(name + " lives in a pineapple (proboly plastic)");
        }
  		if (name.equals ("a minority charicter")){
      		System.out.println(name + ", we really dont know where he/she lives.");
         }
  		if (name.equals ("patric")){
      		System.out.println(name + " lives under a rock");
            }
}

}
