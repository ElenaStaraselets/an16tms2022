package garage;

public class Engine {
    private String engineType;
    private int engineVolume;
    private boolean engineWork = false;
    private GasTank gasTank;

    public Engine(String engineType, int engineVolume, GasTank gasTank) {
        this.engineType = engineType;
        this.engineVolume = engineVolume;
        this.gasTank = gasTank;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public boolean isEngineWork() {
        return engineWork;
    }

    //машина может ехать если в баке есть бензин

    public void on() {
        if (gasTank.getCurrentLevel() > 0) {
            engineWork = true;
        }

    }

    public void off() {
        engineWork = false;
    }


}
