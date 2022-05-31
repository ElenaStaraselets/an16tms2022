package transport;


public class MilitaryAviation extends AirTransport {
    private boolean ejectionSystem;
    private int missilesNumber;

    public MilitaryAviation(int horsePower, int topSpeed, int weight, String brand, int wingSpan, boolean ejectionSystem, int missilesNumber) {
        super(horsePower, topSpeed, weight, brand, wingSpan);
        this.ejectionSystem = ejectionSystem;
        this.missilesNumber = missilesNumber;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public int getMissilesNumber() {
        return missilesNumber;
    }


    public int getPowerInKW() {
        return (int) (this.getHorsePower() * 0.74);
    }

//    Для Военных самолётов делаем метод выстрел, проверяем если кол-во
//    ракет не равно 0 то выводим на консоль “ Ракета пошла...”, если 0 то
//“Боеприпасы отсутствуют”.

    public void fire() {
        if (missilesNumber > 0) {
            System.out.println("Ракета пошла");
        } else
            System.out.println("Боеприпасы отсутствуют");
    }
//    А так же метод катапультирование, который проверит если наличие системы
//    катапультирования true, то выводим “Катапультирование прошло успешно”,
//    если false, то “У вас нет такой системы ”

    public void eject() {
        if (ejectionSystem == true) {
            System.out.println("Катапультирование прошло успешно");
        } else
            System.out.println("У вас нет такой системы");
    }


    public void printInnerCharacteristics() {
        System.out.println("Объект военной авиации" +
                "Марка " + getBrand() +
                "наличие катапульты=" + (ejectionSystem ? "Да" : "Нет") +
                ", число ракет=" + missilesNumber +
                ", размах крыльев=" + getWingSpan() +
                ", мин. длина ВПП=" + getMinRunway() +
                ", мощность в киловатах =" + getPowerInKW());
    }
}
