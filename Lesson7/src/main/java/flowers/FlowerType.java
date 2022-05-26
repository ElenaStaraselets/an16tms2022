package flowers;

public enum FlowerType {
    CHRISANTEMUM(15), GERBERA(10), TULIP(3), EUSTOMA(20), PINK(8), FREESIA(15), GYPSOPHILE(11), POPPY(9), SUNFLOWER(25), ORCHID(30);
    final int cost;

    FlowerType(int cost) {
        this.cost = cost;
    }
}
