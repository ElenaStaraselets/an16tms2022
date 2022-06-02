package wear.footwear;

import wear.BaseClothes;

public class Shoes extends BaseClothes implements IFootwear {
    public Shoes(String name) {
        super(name);
    }
    @Override
    public void putOn() {
        System.out.println("Обувается в " +getName());
    }

    @Override
    public void getOff() {
        System.out.println("Снимает " +getName());
    }
}
