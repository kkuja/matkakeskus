package lipunmyynti;


public interface Vehicle {
	public Ticket[] getPassangers();
	public boolean addPassanger(Ticket passanger);
	public int countPassangers();
	public int countSeats();
	public double countTotalTicketRevenue();
	public void setRoute(Route route);
	public Route getRoute();
}

