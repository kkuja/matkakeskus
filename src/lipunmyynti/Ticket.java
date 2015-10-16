package lipunmyynti;

//import java.math.BigDecimal;

public class Ticket {
	private double price;
	private PriceType priceType;
	
	
	public Ticket() {
		super();
		this.price = 1;
		this.priceType = new PriceType();
	}
	
	public Ticket(double price, PriceType priceType) {
		super();
		this.price = price;
		this.priceType = priceType;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the priceType
	 */
	public PriceType getPriceType() {
		return priceType;
	}

	/**
	 * @param priceType the priceType to set
	 */
	public void setPriceType(PriceType priceType) {
		this.priceType = priceType;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public double CalculateFinalPrice()
	{
		return this.price*this.getPriceType().getPriceMultiplier();
	}
}
