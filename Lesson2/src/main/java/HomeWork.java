public class HomeWork {
    public static void main(String[] args) {
        //вывод на консоль
        printLiterals();
        //Некоторые тесты для проверки задач.
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(calculateHypotenuse(3, 4));
    }

    private static void printLiterals() {
//        вывести на консоль литералы следующих видов:
//        логический
        boolean logical = true;
        System.out.println(true);

//        строковый
        System.out.println("Строковый литерал");

//        символьный
        System.out.println("Символьный литерал Амперсанд - " + '&');

//        целочисленный 2-й
        int i2 = 0b0101110;
        System.out.println("Целочисленный литерал в двоичной системе " + Integer.toBinaryString(i2));

//        целочисленный 8-й
        int i8 = 070562;
        System.out.println("Целочисленный литерал в восьмеричной системе " + Integer.toOctalString(i8));

//        целочисленный 10-й
        int i10 = 45685;
        System.out.println("Целочисленный литерал в десятеричной системе " + i10);

//        целочисленный 16-й
        int i16 = 0x140f5a;
        System.out.println("Целочисленный литерал в восьмеричной системе " + Integer.toHexString(i16));

//        литерал типа float
        float f = 5.358e-2f;
        System.out.println("Литерал типа float " + f);

//        литерал типа double.
        double d = 8.7;
        System.out.println("Литерал типа double " + d);
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        if ((long)a + (long)b > Integer.MAX_VALUE)
            return (-1);
        else
        return ( a + b );
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * <p>
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(a*a+b*b);

    }
}
