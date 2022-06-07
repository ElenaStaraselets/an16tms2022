package cosmo;

public class Shuttle implements IStart{
    private String name;

    public Shuttle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean checkStart() {
        boolean value;
        if (Math.random() > 0.3) value = true;
        else value = false;
        return value;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла");
    }
}
