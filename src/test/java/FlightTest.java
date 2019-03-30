import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger;
    Plane plane;
    Flight flight;

    @Before
    public void setup() {
        passenger = new Passenger("Bob");
        plane = new Plane(PlaneType.BOEING747, "Iberia");
        flight = new Flight(plane, 001, "Edinburgh");
    }

    @Test
    public void getFlightTest() {
        assertEquals(PlaneType.BOEING747, flight.getPlane());
        assertEquals(001, flight.getFlightNumber());
        assertEquals("Edinburgh", flight.getDestination());
    }

}
