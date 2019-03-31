public class Passenger {

    private String name;
    private int wallet;

    public Passenger(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return this.name;
    }

    public int getWallet() {
        return this.wallet;
    }

    public int payTicket(Passenger passenger, Flight flight) {
         return passenger.wallet -= flight.getPrice();
    }

}
