import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger;
    Plane plane;
    Flight flight;

    @Before
    public void setup() {
        passenger = new Passenger("Bob", 200);
        plane = new Plane(PlaneType.BOEING747, "Iberia");
        flight = new Flight(plane, 001, "Edinburgh", 100);
    }

    @Test
    public void getFlightTest() {
        assertEquals(PlaneType.BOEING747, flight.getPlane());
        assertEquals(001, flight.getFlightNumber());
        assertEquals("Edinburgh", flight.getDestination());
        assertEquals(100, flight.getPrice());
    }

    @Test
    public void getPassengerTest() {
        plane.addPassenger(passenger);
        assertEquals(1, flight.getPassengerList());
    }

}
