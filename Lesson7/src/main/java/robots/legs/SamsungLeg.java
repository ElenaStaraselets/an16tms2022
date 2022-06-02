package robots.legs;

public class SamsungLeg implements ILeg {
    private int legPrice;

    public SamsungLeg(int legPrice) {
        this.legPrice = legPrice;
    }

    public SamsungLeg() {
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
        return "SamsungLeg";
    }


}
