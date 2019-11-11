import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTest {
	@Test
	public void test() {
		Movie movie = new Movie("movie1",1);
		Movie movie2 = new Movie("movie2",2);
		Movie movie3 = new Movie("movie3",0);
		
		Customer customer1 = new Customer("Fulano");
		customer1.addRental(new Rental(movie,1));
		customer1.addRental(new Rental(movie2,11));
		customer1.addRental(new Rental(movie3,12));
		
		String a=customer1.statement();
		Assertions.assertEquals(a, "Rental Record for Fulano\n" + "	movie1	3.0\n" + "	movie2	13.5\n" + "	movie3	17.0\n" + "Amount owed is 33.5\n" + "You earned 3 frequent renter points");
	}
	
}
