import java.util.ArrayList;

public class Plane {

    private PlaneType plane;
    private String airline;
    ArrayList<Passenger> passengers;

    public Plane(PlaneType plane, String airline) {
        this.plane = plane;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public PlaneType getPlane() {
        return plane;
    }

    public int getPlaneCapacity() {
        return plane.getCapacity();
    }

    public String getAirline() {
        return airline;
    }

    public int getPassengerList() {
        return passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < plane.getCapacity()) {
            passengers.add(passenger);
        }
    }

}
