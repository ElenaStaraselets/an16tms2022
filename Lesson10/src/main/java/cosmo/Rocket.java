package cosmo;

import java.util.Random;

public class Rocket implements IStart {

    private String name;

    public Rocket(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean checkStart() {
        Random rd = new Random();
        return (rd.nextBoolean());
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Ракеты запущены. Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт Ракеты");

    }
}
