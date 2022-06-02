package wear.jackets;

import wear.BaseClothes;

public class WarmJacket extends BaseClothes implements IJacket{
    public WarmJacket(String name) {
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
