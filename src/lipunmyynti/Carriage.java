package lipunmyynti;

public class Carriage {
	private Ticket[] tickets;
	
	public Carriage() {
		super();
		tickets = new Ticket[20];
	}

	/**
	 * @return the tickets
	 */
	public Ticket[] getTickets() {
		return tickets;
	}
	
	public double getTotalTicketRevenue()
	{
		double totalRevenue = 0;
		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i] != null ) {
				totalRevenue += tickets[i].CalculateFinalPrice();
			}
		}
		return totalRevenue;
	}
	
	public int getPassangerCount()
	{
		int ticketCount = 0;
		// Count non null tickets
		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i] != null ) {
				ticketCount ++;
			}
		}
		return ticketCount;
	}
	public Ticket[] getPassangers()
	{
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
	public int getSeatCount()
	{
		return this.tickets.length;
	}

	public boolean addPassanger(Ticket passanger)
	{
		boolean seatFound = false;
		for  (int i = 0; i < this.tickets.length; i++)
		{
			if (this.tickets[i] == null)
			{
				this.tickets[i] = passanger;
				seatFound = true;
				break;
			}
		}
		return seatFound;
	}
}
