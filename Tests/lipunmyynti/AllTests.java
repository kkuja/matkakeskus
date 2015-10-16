package lipunmyynti;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BusTest.class, CarriageTest.class, PriceTypeTest.class, RouteListTest.class, RouteTest.class,
		StationTest.class, TicketTest.class, TrainTest.class, VendorTest.class })
public class AllTests {

}
