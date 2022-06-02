package wear.jackets;

import wear.IClothes;

public interface IJacket extends IClothes {
    @Override
    default void putOn() {

    }

    @Override
    default void getOff() {

    }
}
