package Lesson12HW;

import java.io.Serializable;

public class Tank implements Serializable {

    private String fuelType;
    private int volume;

    public Tank(String fuelType, int volume) {
        this.fuelType = fuelType;
        this.volume = volume;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "fuelType='" + fuelType + '\'' +
                ", volume=" + volume +
                '}';
    }
}
