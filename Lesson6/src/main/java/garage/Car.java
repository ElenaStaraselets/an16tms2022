package garage;

public class Car {
    private Engine engine;
    private GasTank gasTank;
    private String carBrand;
    private int productionYear = 2020;
    private int mileage = 0;

    //создаем конструктор с обязательным наличием двигателя и бензобака
    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    //создаем метод включения автомобиля, который включает двигатель

    public void on() {
        engine.on();
    }

    //метод езды на машине

    public void run() {
        if (engine.isEngineWork()) {
            System.out.println("Машина едет");
        }

    }

    //глушим машину, добавляя после каждой поездки одинаковый пробег

    public void stop() {
        if (engine.isEngineWork()) {
            engine.off();
            mileage += 50;
        }
    }

    //реализуем возможность посмотреть, какое расстояние машина прошла за все время

    public int getMileage() {
        return mileage;
    }
}
