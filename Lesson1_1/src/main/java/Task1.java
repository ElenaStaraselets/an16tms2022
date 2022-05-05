public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            int i = Integer.parseInt(arg);
            if (i > 0){
                count = count + 1;

            }


        }
        System.out.println("количество положительных чисел = "+count);

    }
}