package flowers;

public class Bouquet {
    private Flower  []flowers;

    public Bouquet(Flower [] flowers) {
        this.flowers = flowers;
    }

    public int getTotalPrice(){
        int cost = 0;
        for (Flower f:flowers
             ) {
            cost = cost+f.getPrice();
        }
        return cost;
    }
}


