package challengeCheersForBeers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeer {

	// Test Data

	String validBeerLow;
	String validBeerHigh;

	String validCountryLow;
	String validCountryHigh;

	String validBeerStyleLow;
	String validBeerStyleHigh;

	double validAlcoholPercentageLow;
	double validAlcoholPercentageHigh;

	Beer b;

	@BeforeEach
	void setUp() throws Exception {

		validBeerLow = "Harp";
		validBeerHigh = "Guinness";

		validCountryLow = "Peru";
		validCountryHigh = "Switzerland";

		validBeerStyleLow = "Beer";
		validBeerStyleHigh = "Nutured in the fields of Ireland";

		validAlcoholPercentageLow = 2.3;
		validAlcoholPercentageHigh = 99.7;

		b = new Beer(validBeerLow, validBeerStyleLow, validCountryLow, validAlcoholPercentageLow);

	}

	@Test
	void testBeerConstructorWithArgs () {
		assertEquals(validBeerLow, b.getBeerName());
		assertEquals(validBeerStyleLow, b.getBeerStyle());
		assertEquals(validCountryLow, b.getCountry());
		assertEquals(validAlcoholPercentageLow, b.getAlcoholPercentage());
		
		b = new Beer(validBeerHigh, validBeerStyleHigh, validCountryHigh, validAlcoholPercentageHigh);
		assertEquals(validBeerHigh, b.getBeerName());
		assertEquals(validBeerStyleHigh, b.getBeerStyle());
		assertEquals(validCountryHigh, b.getCountry());
		assertEquals(validAlcoholPercentageHigh, b.getAlcoholPercentage());
		
				
	}

	@Test
	void testSetGetBeerName() {
		b.setBeerName(validBeerLow);
		assertEquals(validBeerLow, b.getBeerName());
		
		b.setBeerName(validBeerHigh);
		assertEquals(validBeerHigh, b.getBeerName());
	}

	@Test
	void testSetGetBeerStyle() {
		b.setBeerStyle(validBeerStyleLow);
		assertEquals(validBeerStyleLow, b.getBeerStyle());
		
		b.setBeerStyle(validBeerStyleHigh);
		assertEquals(validBeerStyleHigh, b.getBeerStyle());
	}

	@Test
	void testSetGetCountry() {
		b.setCountry(validCountryLow);
		assertEquals(validCountryLow, b.getCountry());
		
		b.setCountry(validCountryHigh);
		assertEquals(validCountryHigh, b.getCountry());
	}

	@Test
	void testSetGetAlcoholPercentage() {
		b.setAlcoholPercentage(validAlcoholPercentageLow);
		assertEquals(validAlcoholPercentageLow, b.getAlcoholPercentage());
		
		b.setAlcoholPercentage(validAlcoholPercentageHigh);
		assertEquals(validAlcoholPercentageHigh, b.getAlcoholPercentage());
	}

}
