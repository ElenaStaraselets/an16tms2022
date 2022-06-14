package Lesson12HW;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private int speed;
    private int price;
    private Engine engine;
    private Tank tank;

    public Car(String brand, int speed, int price, Engine engine, Tank tank) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
        this.engine = engine;
        this.tank = tank;
    }

    public String getMarka() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tank getTank() {
        return tank;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                ", engine=" + engine +
                ", tank=" + tank +
                '}';
    }
}
