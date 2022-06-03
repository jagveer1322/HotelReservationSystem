package hotelreservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {
	HotelReservationSystemTest hRSystem = new HotelReservationSystemTest();

	@Test
	public void testAddHotel() {
		hRSystem.testAddHotel();
		Assert.assertEquals(3, 3);
	}

	@Test
	public void testAddHotelShouldFail() {
		hRSystem.testAddHotel();
		Assert.assertEquals(2, 3);
	}

	@Test
	public void givenDataShouldBeFoundCheapestHotel() {
		hRSystem.testAddHotel();

		Assert.assertEquals(220, hRSystem.findCheapestHotel("10-09-2020", "11-09-2020"));
	}

}
