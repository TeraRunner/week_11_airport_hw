import org.junit.Before;
import org.junit.Test;

public class AirportTest {

    Passenger passenger;
    Plane plane1;
    Plane plane2;
    Flight flight1;
    Flight flight2;
    Airport airport;

    @Before
    public void setup() {
        passenger = new Passenger("Bob");
        plane1 = new Plane(PlaneType.BOEING747, "Iberia");
        plane2 = new Plane(PlaneType.A380, "easyJet");
        flight1 = new Flight(plane1, 001, "Edinburgh");
        flight2 = new Flight(plane2, 002, "London");
        airport = new Airport("MAD");
    }

//    @Test

}
