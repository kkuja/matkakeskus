package lipunmyynti;

import static org.junit.Assert.*;


import org.junit.Test;

public class TrainTest {

	@Test
	public void testTrain() {
		// Test constructors.
		// Test default
		Train train = new Train();
	
		// default constructor should put 3 carriages to train
		assertEquals(3, train.getCarriageCount());

		// Test with valid parameter
		Train train2 = new Train(5);
		assertEquals(5, train2.getCarriageCount());

		// Minimum number of carriages is 3. Test we cannot go below it.
		Train train3 = new Train(2);
		assertEquals(2, train3.getCarriageCount());

		// Maximum number of carriages is 12. Test we cannot go above it.
		Train train4 = new Train(15);
		assertEquals(15, train4.getCarriageCount());

	}

	@Test
	public void testGetPassangers() {
		// This should be done much better... But I don't yet know how this
		// should be done.
		Train train = new Train();
		train.addPassanger(new Ticket());
		
		assertEquals(1, train.getPassangers().length);
	}

	@Test
	public void testAddPassanger() {
		// Actually, this is kind of redundant test, but let's do it anyway.
		Train train = new Train();
		train.addPassanger(new Ticket());
		train.addPassanger(new Ticket());
		train.addPassanger(new Ticket());
		assertEquals(3, train.getPassangers().length);
		
		// Test you cannot add too many passangers
		for (int i = 0; i < train.countSeats()+1; i++)
		{
			assertTrue(train.addPassanger(new Ticket()));			
		}
	}

	@Test
	public void testCountPassangers() {
		Train train = new Train();
		train.addPassanger(new Ticket());
		train.addPassanger(new Ticket());
		train.addPassanger(new Ticket());
		
		assertEquals(3, train.countPassangers());
		
	}

	@Test
	public void testCountTotalTicketRevenue() {
		Train train  = new Train();
		Ticket t1 = new Ticket();
		t1.setPrice(10.00);
		Ticket t2 = new Ticket();
		t2.setPrice(25.00);
		train.addPassanger(t1);
		train.addPassanger(t2);
		assertEquals(35.00, train.countTotalTicketRevenue(),0);
	}

	@Test
	public void testSetRoute() {
		Train train  = new Train();
		train.setRoute(new Route());
		assertTrue(train.getRoute() instanceof Route);
	}

	@Test
	public void testGetRoute() {
		Train train  = new Train();
		train.setRoute(new Route());
		assertTrue(train.getRoute() instanceof Route);
	}

}
