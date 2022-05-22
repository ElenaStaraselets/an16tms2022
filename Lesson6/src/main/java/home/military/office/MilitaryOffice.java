package home.military.office;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void printSoldiers() {

        int prizyvnykMinsk = 0;
        int prizyvnikMiddle = 0;
        int prizyvnikSanya = 0;
        for (Person p : personRegistry.getPersonArrayList()) {

            if (p.getAge() >= 18 && p.getAge() <= 27 && p.getSex().equalsIgnoreCase("m")) {
                System.out.println(p.toString());
                if (p.getAddress().getCity().equalsIgnoreCase("Minsk")) {
                    prizyvnykMinsk++;
                }
                if (p.getAge() >= 25 && p.getAge() <= 27) {
                    prizyvnikMiddle++;
                }
                if (p.getName().equalsIgnoreCase("Александр")) {
                    prizyvnikSanya++;
                }
            }
        }
        System.out.println("Количество годных призывников в городе Минске " + prizyvnykMinsk);
        System.out.println("Количество призывников от 25 до 27 лет " + prizyvnikMiddle);
        System.out.println("Количество призывников с именем Александр " + prizyvnikSanya);


    }
}
