package transport;

public class AirTransport extends Transport {
    private int wingSpan;
    private int minRunway;


    public AirTransport(int horsePower, int topSpeed, int weight, String brand, int wingSpan) {
        super(horsePower, topSpeed, weight, brand);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public int getMinRunway() {
        return minRunway;
    }


}
