package lipunmyynti;

import java.util.Calendar;

public class Vendor {

	public RouteList searchRoutes(Station startStation, Station endStation,
								Calendar startTime, Calendar endTime) {
		return new RouteList();
	}
	
	// Should this actually be createTicket(Route)...?
	public boolean createTicket(Station startStation, Station endStation,
								Calendar startTime, Calendar endTime) {
		return false;
	}
}
