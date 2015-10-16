package lipunmyynti;

import java.util.Calendar;
//import java.util.Date;

public class Station {
	private String name;
	private Calendar arrivalTime;
	private Calendar departureTime;
	
	public Station() {
		super();
	}
	public Station(String name, Calendar arrivalTime, Calendar departureTime) {
		super();
		this.name = name;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the arrivalTime
	 */
	public Calendar getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(Calendar arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	/**
	 * @return the departureTime
	 */
	public Calendar getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(Calendar departureTime) {
		this.departureTime = departureTime;
	}
	
}
