package transport;

public class CivilAviation extends AirTransport {
    private int passengersAmount;
    private boolean businessClass;

    public CivilAviation(int horsePower, int topSpeed, int weight, String brand, int wingSpan, int passengersAmount, boolean businessClass) {
        super(horsePower, topSpeed, weight, brand, wingSpan);
        this.passengersAmount = passengersAmount;
        this.businessClass = businessClass;
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public int getPowerInKW() {
        return (int) (this.getHorsePower() * 0.74);
    }

    public void passengerAmountCheck(int nowPassengersAmount) {
        if (nowPassengersAmount <= passengersAmount) {
            System.out.println("Самолет загружен");
        } else
            System.out.println("Вам нужен самолет побольше");
    }


    public void printInnerCharacteristics() {
        System.out.println("Объект гражданской авиации" +
                "Наличие бизнес класса =" + (businessClass ? "Да" : "Нет") +
                ", количество пассажиров =" + passengersAmount +
                ", размах крыльев =" + getWingSpan() +
                ", мин. длина ВПП =" + getMinRunway() +
                ", мощность в киловатах =" + getPowerInKW() +
                '}');
    }
}
