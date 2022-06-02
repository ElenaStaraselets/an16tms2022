package robots.legs;

public class ToshibaLeg implements ILeg {
    private int legPrice;

    public ToshibaLeg(int legPrice) {
        this.legPrice = legPrice;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Топ-топ");
    }

    @Override
    public int getPrice() {
        return legPrice;
    }
    @Override
    public String toString() {
        return "ToshibaLeg";
    }
}
