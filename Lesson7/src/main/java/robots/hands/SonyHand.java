package robots.hands;

public class SonyHand implements IHand {

    private int handPrice;

    public SonyHand(int handPrice) {
        this.handPrice = handPrice;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Hello!");
    }

    @Override
    public int getPrice() {
        return handPrice;
    }

    @Override
    public String toString() {
        return "SonyHand";
    }
}
