package garage;

public class Main {
    public static void main(String[] args) {

        GasTank gt = new GasTank(60, 20);
        Engine e = new Engine("diesel", 2, gt);
        Car car = new Car(e, gt);

        car.on();
        car.run();
        car.stop();
        System.out.println("Пробег составляет " + car.getMileage());

        car.on();
        car.run();
        car.stop();
        System.out.println("Пробег составляет " + car.getMileage());
    }
}
