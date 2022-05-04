import java.util.Scanner;
import java.util.StringTokenizer;

public class Task2 {
    public static void main(String [] args){
        System.out.println("Введите числа через пробел");
        //объявляем переменную console типа Scanner
        Scanner console = new Scanner(System.in);
        //читаем строку их консоли при нажатии Enter и заносим ее в переменную data
        String data = console.nextLine();

        System.out.println("Вы ввели строку [" + data + "]");
        //объявляем переменную количества чисел i
        int i = 0;
        //делим строку по разделителю "пробел"
        StringTokenizer st = new StringTokenizer(data," ");

        String val;

        //повторяем действие на каждом объекте после разделителя
        while(st.hasMoreTokens()) {
             val = st.nextToken();

             //преобразуем строку в число
            try {
                int ival = Integer.parseInt(val);
                if(ival>0)
                    i=i+1;
            }
            catch (NumberFormatException  e){
                System.out.println("Символ [" + val + "] не является целым числом");
            }

        }

        System.out.println("количество положительных чисел =[" + i + "]");
    }
}
