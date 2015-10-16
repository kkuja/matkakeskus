package lipunmyynti;

import static org.junit.Assert.*;


import org.junit.Test;

public class BusTest {

	@Test
	public void testBus() {
		// Test constructors.
		// Test default
		Bus bus = new Bus();
	
		// default number of seats to bus is 20
		assertEquals(20, bus.countSeats());

		// Test with valid parameter
		Bus bus2 = new Bus(50);
		assertEquals(50, bus2.countSeats());

	}

	@Test
	public void testGetPassangers() {
		// This should be done much better... But I don't yet know how this
		// should be done.
		Bus bus = new Bus();
		bus.addPassanger(new Ticket());
		
		assertEquals(1, bus.getPassangers().length);
	}

	@Test
	public void testAddPassanger() {
		// Actually, this is kind of redundant test, but let's do it anyway.
		Bus bus = new Bus();
		bus.addPassanger(new Ticket());
		bus.addPassanger(new Ticket());
		bus.addPassanger(new Ticket());
		
		assertEquals(3, bus.getPassangers().length);
	}

	@Test
	public void testCountPassangers() {
		Bus bus = new Bus();
		bus.addPassanger(new Ticket());
		bus.addPassanger(new Ticket());
		bus.addPassanger(new Ticket());
		
		assertEquals(3, bus.countPassangers());
		
	}

	@Test
	public void testCountTotalTicketRevenue() {
		Bus bus  = new Bus();
		Ticket t1 = new Ticket();
		t1.setPrice(10.00);
		Ticket t2 = new Ticket();
		t2.setPrice(25.00);
		bus.addPassanger(t1);
		bus.addPassanger(t2);
		assertEquals(35.00, bus.countTotalTicketRevenue(),0);
	}

	@Test
	public void testSetRoute() {
		Bus bus  = new Bus();
		bus.setRoute(new Route());
		assertTrue(bus.getRoute() instanceof Route);
	}

	@Test
	public void testGetRoute() {
		Bus bus  = new Bus();
		bus.setRoute(new Route());
		assertTrue(bus.getRoute() instanceof Route);
	}

}
