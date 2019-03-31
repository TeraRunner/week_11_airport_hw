public class Flight {

    private Plane plane;
    private int flightNumber;
    private String destination;
    private int price;

    public Flight(Plane plane, int flightNumber, String destination, int price) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.price = price;
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

    public int getPassengerList() {
        return this.plane.getPassengerList();
    }

    public int getPrice() {
        return this.price;
    }

}
