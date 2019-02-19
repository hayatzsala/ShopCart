import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class OnlineBooksTest {

	@Test 
	public void testCart() {
		
		assertEquals(0.0 ,OnlineBooks.totalCost(),0);
		
		OnlineBooks.AddToCart();
		 assertEquals(127.0, OnlineBooks.totalCost(),0);
		 
		 OnlineBooks.AddToCart();
		 assertEquals(227.0,OnlineBooks.totalCost(),0);
	}
	
}
