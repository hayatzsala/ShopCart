import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class OnlineBooksTest {

	@Test
	public void testZero() {
		
		assertEquals(0.0 ,OnlineBooks.totalCost(),0);
	}
	 @Ignore
	 public void testOne() {
		 assertEquals(127.0, OnlineBooks.totalCost(),0);
	 }
	 
	 @Ignore
	 public void testMany() {
		 assertEquals(227.0,OnlineBooks.totalCost(),0);
		 
		 
	 }

}
