public enum PlaneType {

    BOEING747(1),
    A380(2),
    DC(3);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    //pretyname, a veces no devuelve el type, poner un string para ello

}