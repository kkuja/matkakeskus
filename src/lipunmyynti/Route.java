package lipunmyynti;

public class Route {

	private Vehicle vehicle;
	private double price;
	
	public Route() {
		super();
	}
	public double getPrice(){
		return price;
	}
	public void assignVehicle(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	public Vehicle getVehicle()
	{
		return this.vehicle;
	}
}
