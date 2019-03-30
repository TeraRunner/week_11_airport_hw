public class Flight {

    private Plane plane;
    private int flightNumber;
    private String destination;

    public Flight(Plane plane, int flightNumber, String destination) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public PlaneType getPlane() {
        return this.plane.getPlane();
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

}
