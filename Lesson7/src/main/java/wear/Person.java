package wear;

import wear.footwear.IFootwear;
import wear.jackets.IJacket;
import wear.trousers.ITrousers;

public class Person  {
    private String name;
    private IJacket jacket;
    private ITrousers trousers;
    private IFootwear footwear;

    public Person(String name, IJacket jacket, ITrousers trousers, IFootwear footwear) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.footwear = footwear;
    }

    public void putOn() {
        System.out.println( "Человек " + name );
        jacket.putOn();
        trousers.putOn();
        footwear.putOn();
    }

    public void getOff() {
        jacket.getOff();
        trousers.getOff();
        footwear.getOff();
    }


}
