package transport;

public class Passenger extends GroundTransport {
    private String bodyType;
    private int passengersAmount;


    private double fuelCalculation() {
        return getFuelConsumption() / 100;
    }


    public void count(int timeInHours) {
        String a = "За время " + timeInHours + " ч, автомобиль " + getBrand() +
                " двигаясь с максимальной скоростью " + getTopSpeed() + " км/ч, проедет " + getTopSpeed() * timeInHours + " км и израсходует " +
                String.format("%.2f", getTopSpeed() * timeInHours * fuelCalculation()) + " литров топлива.";

        System.out.println(a);
    }


    public Passenger(int horsePower, int topSpeed, int weight, String brand, int wheelsAmount, double fuelConsumption, String bodyType, int passengersAmount) {
        super(horsePower, topSpeed, weight, brand, wheelsAmount, fuelConsumption);
        this.bodyType = bodyType;
        this.passengersAmount = passengersAmount;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    public int getPowerInKW() {
        return (int) (this.getHorsePower() * 0.74);
    }

    @Override
    public String toString() {
        return "Объект наземного легкового транспорта " +
                "Марка " + getBrand() +
                ", мощность" + getPowerInKW() +
                " кВ, максимальная скорость " + getTopSpeed() +
                " км/ч, масса" + getWeight() +
                " кг, количество колес " + getWheelsAmount() +
                ", расход топлива " + getFuelConsumption() +
                ", тип кузова =" + getBodyType() +
                ", количество пассажиров " + getPassengersAmount();
    }


}
