package lipunmyynti;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketTest {

	@Test
	public void testGetPrice() {
		Ticket ticket = new Ticket();
		ticket.setPrice(11.22);
		assertEquals(11.22, ticket.getPrice(), 0);
	}

	@Test
	public void testSetPrice() {
		Ticket ticket = new Ticket();
		ticket.setPrice(11.22);
		assertEquals(11.22, ticket.getPrice(), 0);
	}

	@Test
	public void testCalculateFinalPrice() {
		
		Ticket ticket = new Ticket();
		ticket.setPrice(11.22);
		ticket.setPriceType(new PriceType("Opiskelija", 0.5));
		assertEquals(11.22 / 2, ticket.CalculateFinalPrice(), 0);
	}

}
