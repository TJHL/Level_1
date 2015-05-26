
public class Main {

	
	 public static void main(String[] args){
	 
		 Movie Die_Hard = new Movie("Die Hard",6);
		 
		 Movie Gold_Finger = new Movie("Gold Finger",6);
		 
		 Movie Die_Hard_With_Avengence = new Movie("Die_Hard_With_Avengence",8);
		 
		 //Movie  = new Movie("",);
		 
		// Movie  = new Movie("",);
		 
			System.out.println(Die_Hard.getTitle()+" is my favoret movie. It has a rating of "+Die_Hard.getRating()+ " out of 5.");
		
			NetflixQueue List=new NetflixQueue();
			
			List.addMovie(Die_Hard);
			List.addMovie(Gold_Finger);
			List.addMovie(Die_Hard_With_Avengence);
			//5. Print all the movies in your queue.
			
			//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
			
			//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
	 }
}
