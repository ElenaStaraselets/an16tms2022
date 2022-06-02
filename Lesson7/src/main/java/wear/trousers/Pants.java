package wear.trousers;

import wear.BaseClothes;

public class Pants extends BaseClothes implements ITrousers {
    public Pants(String name) {
        super(name);
    }
    @Override
    public void putOn() {
        System.out.println("Надевает " +getName());
    }

    @Override
    public void getOff() {
        System.out.println("Снимает " +getName());
    }
}
