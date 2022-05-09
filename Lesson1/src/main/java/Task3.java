import java.util.Arrays;


public class Task3 {
    public static void main(String [] args){

        System.out.println("Вы ввели строку " + Arrays.toString(args) );
        //объявляем переменную количества чисел i
        int i = 0;

        //повторяем действие на каждом объекте после разделителя
        for (String val : args) {

            //преобразуем строку в число
            try {
                int ival = Integer.parseInt(val);
                if (ival > 0)
                    i = i + 1;
            } catch (NumberFormatException e) {
                System.out.println("Символ [" + val + "] не является целым числом");
            }

        }

        System.out.println("количество положительных чисел =[" + i + "]");
    }
}
