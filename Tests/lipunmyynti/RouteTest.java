package lipunmyynti;

import static org.junit.Assert.*;

import org.junit.Test;

public class RouteTest {

	@Test
	public void test() {
		Route route = new Route();
		Train train = new Train();
		route.assignVehicle(train);
		Train train2 = (Train) route.getVehicle();
		assertEquals(train, train2);
		//fail("Not yet implemented");
	}

}
