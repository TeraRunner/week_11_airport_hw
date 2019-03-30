import java.util.ArrayList;

public class Airport {

    private String airportCode;
    ArrayList<Plane> hangar;

    public Airport(String getAirportCode) {
        this.airportCode = getAirportCode;
        this.hangar = new ArrayList<>();
    }

}
