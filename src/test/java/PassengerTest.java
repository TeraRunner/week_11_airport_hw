import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setup() {
        passenger = new Passenger("Bob");
    }

    @Test
    public void GetName() {
        assertEquals("Bob", passenger.GetName());
    }

}
