	//5. Print all the movies in your queue.
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
public class NetFlix {
public static void main(String[] args) {
	Movie getsmart = new Movie ("Get Smart",7);
	Movie diehard = new Movie ("Die Hard",8);
	Movie skyfall = new Movie ("Sky Fall",6);
	Movie diehard3 = new Movie ("Die Hard with avengence",6);
	Movie homealone = new Movie ("Home Alone",5);
	System.out.println(getsmart.getTicketPrice());
	System.out.println(diehard.getTicketPrice());
	System.out.println(skyfall.getTicketPrice());
	System.out.println(diehard3.getTicketPrice());
	System.out.println(homealone.getTicketPrice());
	NetflixQueue moviequeue = new NetflixQueue ();
	moviequeue.addMovie(getsmart);
	moviequeue.addMovie(diehard);
	moviequeue.addMovie(skyfall);
	moviequeue.addMovie(diehard3);
	moviequeue.addMovie(homealone);
	moviequeue.printMovies();

}
}
