import java.util.ArrayList;

public class Airport {

    private String airportCode;
    ArrayList<Plane> hangar;

    public Airport(String getAirportCode) {
        this.airportCode = getAirportCode;
        this.hangar = new ArrayList<>();
    }

    public Flight createFlight(Plane plane, int flightNumber, String destination, int price) {
        Flight flight = new Flight(plane, flightNumber, destination, price);
        return flight;
    }

    public int getHangarSize() {
        return hangar.size();
    }

    public void assignPLane(Plane plane) {
        hangar.add(plane);
    }



}

//Sell tickets for flight