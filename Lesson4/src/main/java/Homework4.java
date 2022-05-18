import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Homework4 {

    public static void main(String[] args) {
        weekdays();
        count();
        numberConsist();
        zodiac();
        printArray();
        System.out.println( operation(6));
        int []ints = {7, 6, -5, 3, -8, 10,-46, -30, -12};

        System.out.println("Количество отрицательных чисел в массиве = "+calculateCountOfOddElementsInMatrix(ints));

        int cnt = 135;

        countDevs(cnt);

        foobar(20);


    }

//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.

        public static void weekdays() {
            int w = 1 + (int) (Math.random() * 6);
            String dayNum;
            switch (w) {
                case 1:
                    dayNum = "Понедельник";
                    break;
                case 2:
                    dayNum = "Вторник";
                    break;
                case 3:
                    dayNum = "Среда";
                    break;
                case 4:
                    dayNum = "Четверг";
                    break;
                case 5:
                    dayNum = "Пятница";
                    break;
                case 6:
                case 7:
                    dayNum = "Выходной";
                    break;
                default:
                    dayNum = "";
                    break;
            }
            System.out.println(dayNum);
        }

//2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    public static void count(){


//        while (a <= 24);{
//            System.out.println("Через " + a + "ч. будет " + counter + "амеб");
//            a+=3;
//        }
        int a;
        int counter;
        for (a = 3; a <= 24; a+=3) {
            counter = a*2;
            System.out.println("Через " + a + " ч будет " + counter + " ам.");
        }
    }


//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
    public static void numberConsist(){
        System.out.println("Введите число: ");
        //объявляем переменную console типа Scanner
        Scanner console = new Scanner(System.in);

        //читаем строку их консоли при нажатии Enter и заносим ее в переменную data
        String data = console.nextLine();
        int length = String.valueOf(data).length();
        try {
            int ival = Integer.parseInt(data);
            if(ival>0){
                System.out.println(data + " - это положительное число, количество цифр = " + length);
            }else if(ival<0){
                System.out.println(data + " - это отрицательное число, количество цифр = " + (length-1));
            }else if(ival == 0){
                System.out.println(data + " - это число, равное нулю, количество цифр = 1");
            }
        }
        catch (NumberFormatException  e) {
            System.out.println("Символ [" + data + "] не является целым числом");
        }
    }


//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
    public static void zodiac(){
        System.out.println("Введите день и месяц рождения через пробел: ");
        Scanner console = new Scanner(System.in);
        //читаем строку их консоли при нажатии Enter и заносим ее в переменную data
        String data = console.nextLine();

        System.out.println("Вы ввели строку [" + data + "]");
        int month=0, day=0;
        //делим строку по разделителю "пробел"
        StringTokenizer st = new StringTokenizer(data," ");
        if(st.hasMoreElements()){
            day = Integer.parseInt(st.nextToken());
        }
        if(st.hasMoreElements()){
            month = Integer.parseInt(st.nextToken());
        }

        if((month==1 && day<21)|| (month==12 && day>=23)){
            System.out.println("Знак зодиака Козерог");        }
        else if((month == 1 && day >= 21) || (month==2 && day<=19)){
            System.out.println("Знак зодиака Водолей");}
        else if((month==2 && day>19) || (month==3 && day<=20)){
            System.out.println("Знак зодиака Рыбы");}
        else if((month==4 && day<21) || (month==3 && day>20)){
            System.out.println("Знак зодиака Овен");}
        else if((month==4 && day>=21) || (month==5 && day<=21)){
            System.out.println("Знак зодиака Телец");}
        else if((month==6 && day<=21) || (month==5 && day>21)){
            System.out.println("Знак зодиака Близнецы");}
        else if((month==6 && day>21) || (month==7 && day<=22)){
            System.out.println("Знак зодиака Рак");}
        else if((month==8 && day<=21) || (month==7 && day>22)){
            System.out.println("Знак зодиака Лев");}
        else if((month==8 && day>21) || (month==9 && day<=23)){
            System.out.println("Знак зодиака Дева");}
        else if((month==10 && day<=23) || (month==9 && day>23)){
            System.out.println("Знак зодиака Весы");}
        else if((month==10 && day>23) || (month==11 && day<=23)){
            System.out.println("Знак зодиака Скорпион");}
        else if((month==12 && day<23) || (month==11 && day>23)){
            System.out.println("Знак зодиака Стрелец");}




        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(103);
        countDevs(11);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();
    }



    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        // тут пишем логику
        boolean isIncorrectDigit = true;
        Scanner console = new Scanner(System.in);
        int iVal = 0;


        while (isIncorrectDigit){
            System.out.println("Введите положительное число");
            //читаем строку их консоли при нажатии Enter и заносим ее в переменную data
            iVal = Integer.parseInt(console.nextLine());
            if(iVal > 0)
                isIncorrectDigit = false;
            else {
                System.out.println("Вы ввели не положительное число");
            }
        }

        int [] arr = new int[iVal];
        for(int h=0;h<iVal;h++){
            arr[h]= (int)(Math.random() * 10);

        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        // тут пишем логику
        if( number > 0){
            return  number +1;
        }
        else if( number < 0) {
            return number -2;
        }
        else {
            return 10;
        }

    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        // тут пишем логику
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]<0)
                count=count+1;
        }

        return count;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        // тут пишем логику

        if (count%10 == 1 && count%100!=11){
            System.out.println(count + " программист");
        }
        else if (count%10 >=2 && count%10 <=4){
            System.out.println(count + " программиста");
        }
        else {
            System.out.println(count + " программистов");
        }

    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        // тут пишем логику
        if (number%3 == 0 && number%5 == 0){
            System.out.println("foobar");
        }
        else if (number%3 == 0){
            System.out.println("foo");
        }
        else if (number%5 == 0){
            System.out.println("bar");
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        // тут пишем логику
        for(int i=3;i<1000;i++){

            boolean isSimpleDigit = true;

            for(int h = 2 ; h < i ;h++){
                if (i % h == 0){
                    isSimpleDigit = false;
                    break;
                }
            }

            if(isSimpleDigit)
                System.out.print( i + ",");

        }
    }
}
