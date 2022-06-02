package robots.hands;

public class SamsungHand implements IHand {
    private int handPrice;

    public SamsungHand(int handPrice) {
        this.handPrice = handPrice;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Hi!");

    }

    @Override
    public int getPrice() {
        return handPrice;
    }

    @Override
    public String toString() {
        return "SamsungHand";
    }
}
