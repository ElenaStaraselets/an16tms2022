package season;

public class Main {
    public static void main(String[] args) {

//Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
        Season favourite = Season.AUTUMN;
        System.out.println(favourite.toString());

        //В цикле распечатать все времена года, среднюю температуру и описание времени года.
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
            printData(value);

        }


        Season[] values1 = Season.values();
        for (Season value : values1) {
            System.out.println(value.getDescription());


        }

    }

    //Создать метод, который принимает на вход переменную созданного вами enum типа.
    //Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.
    public static void printData(Season season) {
        switch (season) {

            case SUMMER:
                System.out.println("Я люблю лето");
                ;
                break;

            case AUTUMN:
                System.out.println("Я люблю осень");
                ;
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                ;
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                ;
                break;

        }

    }
}
