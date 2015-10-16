package lipunmyynti;

import static org.junit.Assert.*;

//import java.util.Calendar;

import org.junit.Test;

public class VendorTest {

	@Test
	public void testSearchRoutes() {
		/*
		 * This is also stub. We should check returned RouteList object is valid
		 * and macthes given specs.
		 */
		Vendor vendor = new Vendor();
		Station s1 = new Station(); 
		Station s2 = new Station();
		assertTrue(vendor.searchRoutes(s1, s2, null, null) instanceof RouteList);
	}

	@Test
	public void testCreateTicket() {
		/* TODO: This is stub, and should be rewritten to real test, when specs 
		 are known. Things to check:
		 - Ticket is saved to database
		 - Seat is reserved
		 - Ticket printing is successfull (as far as we know)
		 */
		Vendor vendor = new Vendor();
		Station s1 = new Station(); 
		Station s2 = new Station();
		assertTrue(vendor.createTicket(s1, s2, null, null));
	}

}
