package challengeCheersForBeers;

public class Beer {

	// Instance Variables

	private String beerName;
	private String beerStyle;
	private String country;
	private double alcoholPercentage;

	// Constructor

	/**
	 * Constructor with args
	 * 
	 * @param beerName
	 * @param beerStyle
	 * @param country
	 * @param alcoholPercentage
	 */
	public Beer(String beerName, String beerStyle, String country, double alcoholPercentage) {
		super();
		this.beerName = beerName;
		this.beerStyle = beerStyle;
		this.country = country;
		this.alcoholPercentage = alcoholPercentage;
	}

	// Getters and Setters

	/**
	 * @return the beerName
	 */
	public String getBeerName() {
		return beerName;
	}

	/**
	 * @param beerName the beerName to set
	 */
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}

	/**
	 * @return the beerStyle
	 */
	public String getBeerStyle() {
		return beerStyle;
	}

	/**
	 * @param beerStyle the beerStyle to set
	 */
	public void setBeerStyle(String beerStyle) {
		this.beerStyle = beerStyle;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the alcoholPercentage
	 */
	public double getAlcoholPercentage() {
		return alcoholPercentage;
	}

	/**
	 * @param alcoholPercentage the alcoholPercentage to set
	 */
	public void setAlcoholPercentage(double alcoholPercentage) {
		this.alcoholPercentage = alcoholPercentage;
	} 
	
	// toString Method
	
	public void showAllDetails() {
		System.out.println("Beer Name          : " + getBeerName());
		System.out.println("Beer Style         : " + getBeerStyle());
		System.out.println("Country            : " + getCountry());
		System.out.println("Alcohol Percentage : " + getAlcoholPercentage());
		System.out.println();
		
	}

	@Override
	public String toString() {
		return "Beer [beerName=" + beerName + ", beerStyle=" + beerStyle + ", country=" + country
				+ ", alcoholPercentage=" + alcoholPercentage + "]";
	}

	
	
}
