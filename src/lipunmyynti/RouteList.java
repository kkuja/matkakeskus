package lipunmyynti;

import java.util.Calendar;

public class RouteList {
	private Route[] routes;
	private int routePointer;

	public RouteList() {
		super();
		this.routePointer = 0;
	}
	public RouteList(Route[] routes) {
		super();
		this.routes = routes;
		this.routePointer = 0;
	}

	/**
	 * @return the routes
	 */
	public Route[] getRoutes() {
		return routes;
	}

	public Route getNextRoute()
	{
		Route nextRoute = null;
		try {
			if (this.routes[routePointer] != null) {
				nextRoute = this.routes[routePointer];
				if (routePointer < this.routes.length-1) {
					routePointer++;
				}					
			}
		}
		catch (NullPointerException e){
			// IndexOutOfBoundsException
			System.out.println("Kohdattiin: "+e);
		}
		return nextRoute;
	}
	public void findRoutes(Calendar startTime, Calendar endTime,
							Station startStation, Station endStation) {
		
	}
	
}
