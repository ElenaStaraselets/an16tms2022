package transport;

public class Trucks extends GroundTransport {
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public Trucks(int horsePower, int topSpeed, int weight, String brand, int wheelsAmount, double fuelConsumption, int loadCapacity) {
        super(horsePower, topSpeed, weight, brand, wheelsAmount, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public int getPowerInKW() {
        return (int) (this.getHorsePower() * 0.74);
    }

    public void capacityCheck(int cargoWeight) {
        if (cargoWeight <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else
            System.out.println("Вам нужен грузовик побольше");
    }

    @Override
    public String toString() {
        return "Объект наземного грузового транспорта " +
                "Марка " + getBrand() +
                ", мощность" + getPowerInKW() +
                " кВ, максимальная скорость " + getTopSpeed() +
                " км/ч, масса" + getWeight() +
                " кг, количество колес " + getWheelsAmount() +
                ", расход топлива " + getFuelConsumption() +
                ", грузоподъемность =" + loadCapacity + " т";
    }

}
