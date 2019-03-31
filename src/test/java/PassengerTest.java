import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

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
    public void gePassengerTest() {
        assertEquals("Bob", passenger.getName());
        assertEquals(200, passenger.getWallet());
    }

    @Test
    public void payFlightTest() {
        assertEquals(200, passenger.getWallet());
        passenger.payTicket(passenger, flight);
        assertEquals(100, passenger.getWallet());
    }

}
