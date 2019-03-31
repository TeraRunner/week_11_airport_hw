import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Passenger passenger;
    Plane plane1;
    Plane plane2;
    Flight flight1;
    Flight flight2;
    Airport airport;

    @Before
    public void setup() {
        passenger = new Passenger("Bob", 200);
        plane1 = new Plane(PlaneType.BOEING747, "Iberia");
        plane2 = new Plane(PlaneType.A380, "easyJet");
        flight1 = new Flight(plane1, 001, "Edinburgh", 100);
        flight2 = new Flight(plane2, 002, "London", 75);
        airport = new Airport("MAD");
    }

    @Test
    public void createFlightTest() {
        Flight flight3 = airport.createFlight(plane1, 003, "Barcelona", 50);
        assertEquals( "Barcelona", flight3.getDestination());
    }

    @Test
    public void assignPlane() {
        assertEquals(0, airport.getHangarSize());
        airport.assignPLane(plane1);
        assertEquals(1, airport.getHangarSize());
    }

//    @Test
//    public void sellTickectTest() {
//        assertEquals(,);
//    }

}
