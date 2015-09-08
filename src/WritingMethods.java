/*This is a series of challenges you should write on the 

4 Write a method called “echo” that takes in a word and prints it out twice.
echo(“beer”);		//prints “beer beer”

5 Write a method called “repeat” that repeats a word a certain number of times.
repeat(“hello”, 5); 	//prints “hello hello hello hello hello”

6 Write a method that returns the best programmer.
String theBest = getTheBestCoder();
syso(theBest);

7 Write a method that adds 2 numbers and returns the result.
		int sum = add(2, 2);
		syso(sum);			//prints 4

8 Write a method that works out whether a number is odd or not. */

public class WritingMethods {

	public static void main(String[] args) {
		WritingMethods run = new WritingMethods();
		WritingMethods name = new WritingMethods();
		WritingMethods start = new WritingMethods();
		run.iRock();
		run.rocker("Bob");
		name.truth("Toby");
		start.echo("Subscribe to The Brick Bleeds  ");
	}

	void iRock() {
		System.out.println("Toby rocks");
	}

	void rocker(String rocker) {
		System.out.println(rocker + " rocks");
	}

	void truth(String name) {
		if (name.equals("Justin Bieber")) {
			System.out.println("**** JUSTIN BIEBER!!!!!!!");
		} else
			System.out.println(name + " is awesome.");
		
		}
		void echo(String start){
		System.out.println(start+ " "+ start);
	}
}