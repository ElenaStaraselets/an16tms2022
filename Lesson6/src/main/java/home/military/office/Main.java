package home.military.office;

public class Main {
    public static void main(String[] args) {
        PersonRegistry pr = new PersonRegistry();
        MilitaryOffice mo = new MilitaryOffice(pr);
        mo.printSoldiers();
    }
}
