package lipunmyynti;

import static org.junit.Assert.*;

import org.junit.Test;

public class RouteListTest {

	@Test
	public void testGetRoutes() {
		/*
		 * This is impossible to test properly yet, because we don't have valid
		 * data to which test. But lets test that this returnes correct type
		 * of data, even if it's invalid. 
		 */
		Route r1 = new Route();
		Route r2 = new Route();
		Route[] rlist = {r1,r2};
		RouteList routelist = new RouteList(rlist);
		
		assertSame(rlist,routelist.getRoutes());
		//		fail("Not yet implemented");
	}

	@Test
	public void testGetNextRoute() {
		RouteList routelist = new RouteList();
		assertNull(routelist.getNextRoute());
		//		fail("Not yet implemented");
	}

	@Test
	public void testFindRoutes() {
		/**
		 * I need a another day to internally process how we can test this, 
		 * without database.
		 */
//		fail("Not yet implemented");
	}

}
