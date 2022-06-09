package cars;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> carsArrayList = new ArrayList<>();

        carsArrayList.add (new Car("Audi",200,10000));
        carsArrayList.add (new Car("Kia",220, 15000));
        carsArrayList.add (new Car("Opel",180, 8000));
        carsArrayList.add (new Car("Seat",190, 9000));

        for (Car car:carsArrayList) {
            try {
                car.start();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
       }
    }

}
