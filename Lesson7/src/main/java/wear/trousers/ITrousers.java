package wear.trousers;

import wear.IClothes;

public interface ITrousers extends IClothes {
    @Override
    default void putOn() {

    }

    @Override
    default void getOff() {

    }
}
