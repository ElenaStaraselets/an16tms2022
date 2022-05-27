package flowers;

public class Main {
    public static void main(String[] args) {
        FlowerMarket fm = new FlowerMarket();

        Bouquet bouquet1 = fm.getBouqet("FREESIA","EUSTOMA","FREESIA","GYPSOPHILE","FREESIA");
        System.out.println("Price bouquet1 = " +bouquet1.getTotalPrice());

        Bouquet bouquet2 = fm.getBouqet("ORCHID","ORCHID","ORCHID","POPPY","POPPY","POPPY","GYPSOPHILE");
        System.out.println("Price bouquet2 = " +bouquet2.getTotalPrice());

        Bouquet bouquet3 = fm.getBouqet("SUNFLOWER","SUNFLOWER","SUNFLOWER","GYPSOPHILE");
        System.out.println("Price bouquet3 = " +bouquet3.getTotalPrice());

        Bouquet bouquet4 = fm.getBouqet("CHRISANTEMUM","CHRISANTEMUM","CHRISANTEMUM","CHRISANTEMUM","CHRISANTEMUM");
        System.out.println("Price bouquet4 = " +bouquet4.getTotalPrice());

        Bouquet bouquet5 = fm.getBouqet("PINK","PINK","TULIP","TULIP","TULIP");
        System.out.println("Price bouquet5 = " +bouquet5.getTotalPrice());



        System.out.println("Общая стоимость пяти букетов = " +(bouquet1.getTotalPrice()+bouquet2.getTotalPrice()+bouquet3.getTotalPrice()+bouquet4.getTotalPrice()+bouquet5.getTotalPrice()));
    }
}
