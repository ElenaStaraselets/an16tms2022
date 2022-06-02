package wear.trousers;

import wear.BaseClothes;
import wear.trousers.ITrousers;

public class ClassicTrousers extends BaseClothes implements ITrousers {

    public ClassicTrousers(String name) {
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
