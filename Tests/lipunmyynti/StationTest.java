package lipunmyynti;

import static org.junit.Assert.*;
import java.util.Calendar;
import org.junit.Test;

public class StationTest {

	@Test
	public void test() {
		Station station = new Station();
		
		station.setName("Aseman nimi");
		assertEquals("Aseman nimi", station.getName());
		Calendar cal= Calendar.getInstance();
		cal.set(115, 10, 6);
		station.setDepartureTime(cal);
		assertTrue(station.getDepartureTime() instanceof Calendar);
	}

}
