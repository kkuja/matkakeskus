package lipunmyynti;

public class PriceType {
	private String priceType;
	private double priceMultiplier;

	/**
	 * Default constructor gives priceType a name "not givin", and 
	 * priceMultiplier 1 (i.e. normal price)
	 * 
	 */
	public PriceType() {
		super();
		this.priceType = "not given";
		this.priceMultiplier = 1;
	}
	public PriceType(String priceType, double priceMultiplier) {
		super();
		this.priceType = priceType;
		this.priceMultiplier = priceMultiplier;
	}
	/**
	 * @return the priceType
	 */
	public String getPriceType() {
		return priceType;
	}
	/**
	 * @param priceType the priceType to set
	 */
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	/**
	 * @return the priceMultiplier
	 */
	public double getPriceMultiplier() {
		return priceMultiplier;
	}
	/**
	 * @param priceMultiplier the priceMultiplier to set
	 */
	public void setPriceMultiplier(double priceMultiplier) {
		this.priceMultiplier = priceMultiplier;
	}
	
	
}
