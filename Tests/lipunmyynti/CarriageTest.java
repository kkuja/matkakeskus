package lipunmyynti;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarriageTest {

	@Test
	public void test() {
		// Test carriage class
		Carriage c1 = new Carriage();
		Ticket[] tickets = new Ticket[20];
		c1.addPassanger(new Ticket());
		tickets[0] = new Ticket();
		
		// Test seat count is correct.
		assertEquals(20, c1.getSeatCount());

		// Ei voi testata näin. Näemmä pitäisi olla täsmälleen sama olio... Miten testataan onko samanlainen rakenteeltaan?
		assertArrayEquals(tickets, c1.getPassangers());
	}

}
