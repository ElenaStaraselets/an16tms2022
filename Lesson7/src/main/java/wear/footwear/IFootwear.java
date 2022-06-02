package wear.footwear;

import wear.IClothes;

public interface IFootwear extends IClothes {
    @Override
    default void putOn() {

    }

    @Override
    default void getOff() {

    }
}
