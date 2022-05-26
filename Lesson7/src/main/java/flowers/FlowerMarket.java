package flowers;

public class FlowerMarket {
    public Bouquet getBouqet(String ... flowers){
        Flower  []fl = new Flower [flowers.length];
        int i =0;
        for (String  s: flowers ) {
            FlowerType flt = FlowerType.valueOf(s);
            fl[i]=new Flower(s, flt.cost);
            i++;
        }


        return new Bouquet(fl);
    }
}
