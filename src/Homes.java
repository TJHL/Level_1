import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

//Copyright Wintriss Technical Schools 2013
public class Homes {
	public static void main(String[]args){
//1. have the tortoise start in the bottom left corner
	Tortoise.setSpeed(10);
	Tortoise.setX(0);
	Tortoise.setY(400);
	Tortoise.show();
//2. draw a house of height 100 |**|_

building_limit("m");
building_limit("m");
building_limit("s");
building_limit("l");
building_limit("m");
building_limit("l");

}
//3. extract that into a method that takes height as a parameter
 static void building_limit(String Size){
	 int height = 100;
	 if(Size.equals("s")){
	 height = 60;}
	 else if(Size.equals("m")){
		  height = 100;}
	 else if(Size.equals("l")){
		  height = 205;}
	 else if(Size.equals("c")){
		  height = 1000000;}
	 
	if(Size.equals("l")){
	 Tortoise.move(height);
	 
	 drawFlatRoof();
	 
	 Tortoise.move(height);
	 Tortoise.turn(270);
	 Tortoise.setPenColor(Color.green);
	 Tortoise.move(20);
	 Tortoise.turn(270);
	 Tortoise.setPenColor(Color.black);
	 }
	//else if()
	 
 }
//4. draw 9 houses of different heights

//5. make the method take a String instead of a height	
	

 

//6. make the method take a color 

//7. make the grass (between houses) always green

//8. give the houses peaked roofs

//9. extract that into a method “drawPointyRoof” and “drawFlatRoof”
public static void drawPointyRoof(){
	Tortoise.turn(45);
	 Tortoise.move(20);
	 Tortoise.turn(90);
	 Tortoise.move(20);
	 Tortoise.turn(45);
}
public static void drawFlatRoof(){
	Tortoise.turn(90);
	Tortoise.move(30);
	Tortoise.turn(90);
}
//10. make large houses have flat rooves

//11. make the roof type selection random

	}

	