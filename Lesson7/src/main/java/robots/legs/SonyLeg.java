package robots.legs;

public class SonyLeg implements ILeg {
    private int legPrice;

    public SonyLeg(int legPrice) {
        this.legPrice = legPrice;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Сделан шаг");
    }

    @Override
    public int getPrice() {
        return legPrice;
    }

    @Override
    public String toString() {
        return "SonyLeg";
    }
}
