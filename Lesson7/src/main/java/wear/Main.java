package wear;

import robots.IRobot;
import robots.Robot;
import wear.footwear.Boots;
import wear.footwear.IFootwear;
import wear.footwear.Shoes;
import wear.jackets.DenimJacket;
import wear.jackets.IJacket;
import wear.jackets.WarmJacket;
import wear.trousers.ClassicTrousers;
import wear.trousers.ITrousers;
import wear.trousers.Pants;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        IJacket denimJacket = new DenimJacket("Джут");
        IJacket warmJacket = new WarmJacket("Теплая куртка");
        ITrousers classicTrousers = new ClassicTrousers("Классические брюки");
        ITrousers pants = new Pants("Штаны");
        IFootwear boots = new Boots("Ботинки");
        IFootwear shoes = new Shoes("Туфли");


        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add (new Person("Афанасий", denimJacket, pants, boots));
        personArrayList.add (new Person("Борис", warmJacket, classicTrousers, shoes));

        for (Person p:personArrayList) {
            p.putOn();
            p.getOff();


        }

//        Person person1 = new Person("Афанасий", denimJacket, pants, boots);
//        Person person2 = new Person("Афанасий", denimJacket, pants, boots);

    }
}
