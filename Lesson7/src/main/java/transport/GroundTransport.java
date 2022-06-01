package transport;

public class GroundTransport extends Transport {
    private int wheelsAmount;
    private double fuelConsumption;

    public GroundTransport(int horsePower, int topSpeed, int weight, String brand, int wheelsAmount, double fuelConsumption) {
        super(horsePower, topSpeed, weight, brand);
        this.wheelsAmount = wheelsAmount;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheelsAmount() {
        return wheelsAmount;
    }

    public void setWheelsAmount(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
