public enum PlaneType {

    BOEING747(200),
    A380(175),
    DC(100);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}