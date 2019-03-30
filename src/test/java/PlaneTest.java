import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger;

    @Before
    public void setup() {
        passenger = new Passenger("Bob");
        plane = new Plane(PlaneType.BOEING747, "Iberia");
    }

    @Test
    public void getPlaneTest() {
        assertEquals(PlaneType.BOEING747, plane.getPlane());
        assertEquals(1, plane.getPlaneCapacity());
        assertEquals("Iberia", plane.getAirline());
    }

    @Test
    public void addPassengerTest() {
        assertEquals(0, plane.getPassengerList());
        plane.addPassenger(passenger);
        assertEquals(1, plane.getPassengerList());
    }

}
