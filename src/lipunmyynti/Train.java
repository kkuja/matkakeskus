package lipunmyynti;

public class Train implements Vehicle {
	private Carriage[] carriage;
	private Route route;
	
	
	public Train() {
		super();
		this.carriage = new Carriage[3];
		for (int i = 0; i < this.carriage.length; i++) {
			this.carriage[i] = new Carriage();
		}
	}
	public Train(int carriageCount) {
		super();
		this.carriage = new Carriage[carriageCount];
	}
	public int getCarriageCount() {
		return this.carriage.length;
	}
	
	@Override
	public int countSeats()
	{
		int totalSeatCount = 0;
		for (int i = 0; i < this.carriage.length; i++)
		{
			totalSeatCount += this.carriage[i].getSeatCount();
		}
		return totalSeatCount;
	}
	
	@Override
	public Ticket[] getPassangers() {
		// TODO Auto-generated method stub
		
		return this.carriage[0].getPassangers();
	}

	@Override
	public boolean addPassanger(Ticket passanger) {
		// TODO Auto-generated method stub
		return carriage[0].addPassanger(passanger);
	}
	
	@Override
	public int countPassangers() {
		// TODO Auto-generated method stub
		int totalPassangerCount = 0;
		for (int i = 0; i < this.carriage.length; i++)
		{
			totalPassangerCount += this.carriage[i].getPassangerCount();
		}
		
		return totalPassangerCount;
	}

	@Override
	public double countTotalTicketRevenue() {
		// TODO Auto-generated method stub
		double totalRevenue = 0;
		for (int i = 0; i < this.carriage.length; i++)
		{
			totalRevenue += this.carriage[i].getTotalTicketRevenue();
		}
		
		return totalRevenue;
	}

	@Override
	public void setRoute(Route route) {
		// TODO Auto-generated method stub
		this.route = route;
	}

	@Override
	public Route getRoute() {
		// TODO Auto-generated method stub
		return this.route;
	}

}
