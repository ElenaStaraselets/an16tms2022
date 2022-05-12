import java.util.Random;
import java.util.Scanner;

public class Homework {

    static Random random = new Random();

    public static void main(String[] args) {
        printAlphabet();
        checkEven();
        module();
        hours();
        table();


        int [] m = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double av = average(m);


        System.out.println(av);

        int[] intArray = {24, 2, 0, 34, 12, 110, 2};

        int maxNum = max(intArray);
        System.out.println(maxNum);
    }


    //Задачи:
    //1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита
    public static void printAlphabet() {
        for (char x = 'A'; x < 'Z'; x++) {
            System.out.println(x);
        }
        for (char x = 'a'; x < 'z'; x++) {
            System.out.println(x);
        }
    }


    //2)Проверка четности числа
    //Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
    // чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
    // Если пользователь введёт не целое число, то сообщать ему об ошибке.
    public static void checkEven() {
        System.out.println("Введите число");
        //объявляем переменную console типа Scanner
        Scanner console = new Scanner(System.in);
        //читаем строку из консоли при нажатии Enter и заносим ее в переменную data
        String data = console.nextLine();

        try {
            int num = Integer.parseInt(data);
            // Если число делится на 2, то это четное число, иначе - нечетное
            // если остаток от деления равен нулю, то четное
            if (num % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }

        } catch (NumberFormatException e) {
            System.out.println("Символ [" + data + "] не является целым числом");
        }
    }

    //3) Меньшее по модулю число
    //Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
    // пользователем вещественных чисел с консоли.

    public static void module() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 3 вещественных числа:");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        System.out.println(a + " " + b + " " + c);

        float tmp = Math.min(a, b);
        float min = Math.min(tmp, c);
        System.out.println("Наименьшее вещественное число по модулю:\n" + min);
    }


    //4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
    // оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
    // когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
    // (т.е. рабочий день закончился).
    //Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
    // Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
    // сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
    //Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
    // далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
    // выводиться фраза о количестве полных часов, содержащихся в n секундах.

    public static void hours() {
        int max = 28800; // Максимальное число для диапазона от 0 до max
        int n = nextRandom(max);
        int h = n / 3600;
        System.out.println(n);

        if (h == 8 || h == 7 || h == 6 || h == 5) {
            System.out.println("Осталось " + h + "часов");
        } else if (h == 4 || h == 3 || h == 2) {
            System.out.println("Осталось " + h + "часа");
        } else if (h == 1) {
            System.out.println("Остался " + h + "час");

        } else {
            System.out.println("Осталось менее часа");
        }
    }

    //Метод получения псевдослучайного целого числа от 0 до max (включая max);
    public static int nextRandom(int max) {
        return random.nextInt(max);// (int) (Math.random() * ++max);
    }

    //5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!

    public static void table() {
        System.out.println("          byte	short	char	int 	long	float	double	boolean");
        System.out.println("byte      т      ня      я       ня      ня     ня      ня      х      ");
        System.out.println("short     я      т       я       ня      ня     ня      ня      х      ");
        System.out.println("char      я       я      т       ня      ня     ня      ня      х      ");
        System.out.println("int       я       я      я       т       ня     ня      ня      х      ");
        System.out.println("long      я       я      я       я       т      ня      ня      х      ");
        System.out.println("float     я       я      я       я       я      т       ня      х      ");
        System.out.println("double    я       я      я       я       я      я       т       х      ");
        System.out.println("boolean   х       х      х       х       х      х       х       т      ");
    }


    /**
     * 6) Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     */
    public static double average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum = sum + value;
        }
        return ((double) sum)/array.length;
    }

    /**
     * 7) Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     * */
    public static int max(int[] array) {

        int maxNum = array[0];
        for (int j : array) {
            if (j > maxNum)
                maxNum = j;
        }

        return maxNum;
    }
}


