import java.util.Random;
import java.util.Scanner;

public class Homework4part2 {
    public static void main(String[] args) {
        //calculateSumOfDiagonalElements();
        System.out.println("Результат умножения " + summ(4, 7));
        System.out.println("Результат умножения " + summ1(4, 7));

        String[][] arr1 = {{" ", " ", " ", "*"}, {" ", " ", "*", "*"}, {" ", "*", "*", "*"}, {"*", "*", "*", "*"}};
        printMatrix1(arr1);
        String[][] arr2 = {{"*", " ", " ", " "}, {"*", "*", " ", " "}, {"*", "*", "*", " "}, {"*", "*", "*", "*"}};
        printMatrix1(arr2);
        String[][] arr3 = {{"*", "*", "*", "*"}, {" ", "*", "*", "*"}, {" ", " ", "*", "*"}, {" ", " ", " ", "*"}};
        printMatrix1(arr3);
        String[][] arr4 = {{"*", "*", "*", "*"}, {"*", "*", "*", " "}, {"*", "*", " ", " "}, {"*", " ", " ", " "}};
        printMatrix1(arr4);

        mass1();
        mass2();
        mass5();
        mass6();
        mass8();

        int[] m7a1 = {0,3,46,3,2,1,2};
        mass7(m7a1 );
        int[] m7a2 = {0,34,46,31,20,1,28};
        mass7(m7a2 );

        printMatrix();
    }

    //        1) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static int summ(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public static int summ1(int a, int b) {
        int out = 0;
        for (int i = 0; i < a; i++)
            out = out + b;

        return out;
    }


    //        2) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *
    public static void printMatrix1(String[][] arr) {
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }


//        Задачи:


    //        3) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void mass1() {
        System.out.println("");
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++)
            arr[i] = 1 + 2 * i;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.println("");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.println("");
    }

//        4) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    public static void mass2() {
        int[] mass = new int[12];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(15);
        }

        int maxIndex = -1;
        int maxVal = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= maxVal) {
                maxVal = mass[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальный элемент " + maxVal + ", индекс последнего вхождения в массив =" + maxIndex);
    }


//        5) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

    public static void mass5() {
        int[] mass = new int[20];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(20);
        }
        System.out.println("");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
            System.out.print(",");
        }
        System.out.println("");

        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 1) {
                mass[i] = 0;
            }
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
            System.out.print(",");
        }
        System.out.println("");
    }


    //        6) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void mass6() {
        int[] mass = new int[12];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt();
        }

        int maxIndex = -1;
        int maxVal = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= maxVal) {
                maxVal = mass[i];
                maxIndex = i;
            }
        }
        mass[maxIndex] = mass[0];
        mass[0] = maxVal;
    }



//        7) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

    public static void mass7(int[] mass) {
        String out = "";
        for (int i = 0; i < mass.length-1; i++) {
            for (int k = i+1; k < mass.length; k++) {
                if(mass[i] == mass[k]){
                    out+=i+"," + k+",";
                }
            }
        }

        if(out == ""){
            System.out.println("Массив не имеет повторяющихся элементов");
        }
        else {
            System.out.println(" Массив имеет повторяющиеся элементы "+out);
        }

    }

//        8) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7

    public static void mass8(){
        Scanner console = new Scanner(System.in);
        int iVal = 0;

        System.out.println("Введите целое положительное число:");
        iVal = Integer.parseInt(console.nextLine());
        if(iVal <= 0) {
            System.out.println("Вы ввели не положительное число");
        }
        else {
            Random rand = new Random();
            int[][] mass = new int[iVal][iVal];
            for (int i = 0; i < mass.length; i++) {

                for (int j = 0; j < mass.length; j++) {
                    mass[i][j]=rand.nextInt(50);
                }
            }

            for (int i = 0; i < mass.length; i++) {
                System.out.println();
                for (int j = 0; j < mass.length; j++) {
                    System.out.print(mass[i][j]);
                    System.out.print(" ");
                }
            }
            System.out.println();

            int mVal = 0;

            for (int i = 1; i < mass.length; i++) {
                for (int j = i; j < mass.length; j++) {
                    mVal = mass[i][j];
                    mass[i][j] = mass[j][i];
                    mass[j][i] = mVal;
                }
            }

            int[][] board = new int[mass[0].length][mass.length];

            for(int i=0; i<mass.length; i++) {
                for(int j=0; j<mass[i].length; j++) {
                    board[j][i] = mass[i][j];
                }
            }

            for (int i = 0; i < board.length; i++) {
                System.out.println();
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        //пишем логику и выводим результат используя System.out.println
        Random rand = new Random();
        int[][] mass = new int[10][10];
        for (int i = 0; i < mass.length; i++) {

            for (int j = 0; j < mass.length; j++) {
                mass[i][j]=rand.nextInt(50);
            }
        }

        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i][i];
        }
        System.out.println("Сумма элементов диагонали = " + sum);
    }


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        // тут пишем логику

        Scanner console = new Scanner(System.in);
        int col = 0, row = 0;

        System.out.println("Введите количество строк:");
        row = Integer.parseInt(console.nextLine());
        System.out.println("Введите количество столбцов:");
        col = Integer.parseInt(console.nextLine());


        Random rand = new Random();
        int[][] mass = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mass[i][j]=rand.nextInt(100);
            }
        }

        //выводим матрицу
        System.out.println();
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print(mass[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println();

        String[][] out = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(mass[i][j]%3 == 0){
                    out[i][j] = "+";
                }
                else  if(mass[i][j]%7 == 0){
                    out[i][j] = "-";
                }
                else{
                    out[i][j] = "*";
                }
            }
        }

        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print(out[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
//    Доп задача!
//    Создать матрицу размера 10 на 10 и заполнить ее случайными целочислеными значениями (тип int) из диапазона от 0 до 10000.
//    Найти максимум среди сумм трех соседних элементов в строке. Для найденной тройки с максимальной суммой выведите значение суммы и индексы(i,j) первого элемента тройки.
//    Пример:
//            *Для простоты пример показан на одномерном массиве размера 10
//            [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254] Тройка с максимальной суммой:  [2789, 4, 8742]
//    Вывод в консоль:
//            11535 (0,5)
//            *Пояснение. Первое число - сумма тройки  [2789, 4, 8742]. Числа в скобках это 0 строка и 5 столбец - индекс первого элемента тройки, то есть индекс числа 2789.

}
