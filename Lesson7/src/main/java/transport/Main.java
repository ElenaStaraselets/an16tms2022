package transport;

public class Main {
    public static void main(String[] args) {

        Passenger myCar = new Passenger(180, 200, 2000, "KIA Sportage", 4, 10, "SUV", 4);
        myCar.count(5);

        Passenger myCar2 = new Passenger(120, 220, 1000, "Toyota Camry", 4, 10, "SUV", 4);
        myCar2.count(5);

        Trucks truck1 = new Trucks(1000, 100, 20000, "MAN", 8, 50, 20);
        truck1.capacityCheck(25);

        Trucks truck2 = new Trucks(800, 120, 15000, "IVECO", 6, 40, 15);
        truck2.capacityCheck(15);

        CivilAviation plane1 = new CivilAviation(50000, 800, 100000, "Ил76", 40, 180, false);
        plane1.passengerAmountCheck(200);

        MilitaryAviation militaryPlane1 = new MilitaryAviation(80000, 2000, 30000, "Миг", 25, true, 2);
        militaryPlane1.fire();
        militaryPlane1.eject();
    }

}
