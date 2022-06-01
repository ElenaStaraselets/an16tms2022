package transport;

public class Transport {
    private int horsePower;
    private int topSpeed;
    private int weight;
    private String brand;


    public Transport(int horsePower, int topSpeed, int weight, String brand) {
        this.horsePower = horsePower;
        this.topSpeed = topSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
