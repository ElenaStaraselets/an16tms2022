package robots.hands;

public class ToshibaHand implements IHand {
    private int handPrice;

    public ToshibaHand(int handPrice) {
        this.handPrice = handPrice;
    }

    public ToshibaHand() {
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
        return "ToshibaHand";
    }
}
