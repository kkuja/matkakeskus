package lipunmyynti;

import static org.junit.Assert.*;

import org.junit.Test;

public class PriceTypeTest {

	@Test
	public void testPriceType() {
		PriceType pt = new PriceType();
		assertEquals("not given", pt.getPriceType());
		assertEquals(1, pt.getPriceMultiplier(),0);
	}

	@Test
	public void testPriceTypeStringDouble() {
		PriceType pt = new PriceType("Opiskelija", 0.5);
		assertEquals("Opiskelija", pt.getPriceType());
		assertEquals(0.5, pt.getPriceMultiplier(),0);
	}

	@Test
	public void testGetPriceType() {
		PriceType pt = new PriceType("Opiskelija", 0.5);
		assertEquals("Opiskelija", pt.getPriceType());
	}

	@Test
	public void testSetPriceType() {
		PriceType pt = new PriceType("Opiskelija", 0.5);
		pt.setPriceType("Työtön");
		assertEquals("Työtön", pt.getPriceType());
	}

	@Test
	public void testGetPriceMultiplier() {
		PriceType pt = new PriceType("Opiskelija", 0.5);
		pt.setPriceMultiplier(0.4);
		assertEquals(0.4, pt.getPriceMultiplier(), 0);
	}

	@Test
	public void testSetPriceMultiplier() {
		PriceType pt = new PriceType("Opiskelija", 0.5);
		pt.setPriceMultiplier(0.4);
		assertEquals(0.4, pt.getPriceMultiplier(), 0);
	}

}
