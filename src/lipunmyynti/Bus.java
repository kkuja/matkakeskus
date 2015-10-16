package lipunmyynti;

public class Bus implements Vehicle {
	private Ticket[] tickets;
	
	
	public Bus() {
		super();
		tickets = new Ticket[20];
	}
	public Bus(int seatCount) {
		super();
		tickets = new Ticket[seatCount];
	}
	@Override
	public int countSeats()
	{
		return tickets.length;
	}	

	@Override
	public Ticket[] getPassangers() {
		// TODO Auto-generated method stub
		int ticketCount = 0;
		int passangerCount = 0;
		// Count non null tickets
		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i] != null ) {
				ticketCount ++;
			}
		}
		
		// Copy passangers to new array, so we can return only passangers.
		Ticket[] passangers = new Ticket[ticketCount];
		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i] != null ) {
				passangers[passangerCount++] = this.tickets[i];
			}
		}
		
		return passangers;
	}

	@Override
	public boolean addPassanger(Ticket passanger) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countPassangers() {
		// TODO Auto-generated method stub
		int ticketCounter = 0;
		for (int i = 0; i < this.tickets.length; i++) {
			if (this.tickets[i] != null) {
				ticketCounter++;
			}				
		}
		return ticketCounter;
	}

	@Override
	public double countTotalTicketRevenue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRoute(Route route) {
		// TODO Auto-generated method stub

	}

	@Override
	public Route getRoute() {
		// TODO Auto-generated method stub
		return null;
	}

}
