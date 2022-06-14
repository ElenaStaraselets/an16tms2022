package strings;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string1 = "fadg rehmmlklkj877bgber, 256 gfdb";
        cutSubstroke(string1);
        replaceSubstroke(string1);
        validateChapter(string1);


        String [] words = {"аврора", "заяц", "карьер", "коридор", "ара", "кабан", "казак"};
        middleSymbols(words);

        String text = "Методы доступа называют ещё аксессорами (от англ. access — доступ), или по отдельности — геттерами (англ. get — чтение) and сеттерами (англ. set — запись)";


        System.out.println("count latin words = " + latinWords(text));

        for (String d:words ) {
            if(check(d)){
                System.out.println(d);
            }

        }
    }

    //* 1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).
    public static void cutSubstroke(String aa) {
        String bb = aa;

        if(aa.indexOf("A") > 0 && aa.lastIndexOf("B") >0)
            bb = aa.substring(aa.indexOf("A"), aa.lastIndexOf("B"));
        else if(aa.indexOf("A") > 0 && aa.lastIndexOf("B") == -1)
            bb = aa.substring(aa.indexOf("A"));
        else if(aa.indexOf("A") ==-1 && aa.lastIndexOf("B") >0)
            bb = aa.substring(0, aa.lastIndexOf("B"));


        System.out.println(bb);
    }

//2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
    public static void replaceSubstroke(String aa) {
        String pos0 = aa.substring(0,1);
        String pos3 = aa.substring(3,4);
        String bb = aa.replace(pos3,pos0);
        System.out.println(bb);
    }
//3) В массиве находятся слова. Вывести на экран слова палиндромы
// * (т.е которые читаются справа на лево и слева на право одинаково, например: заказ, казак, дед...)
    private static boolean check(String w1){
        boolean flag = true;

        for (int i = 0; i < w1.length()/2; i++){
            if(w1.charAt(i) != w1.charAt(w1.length() - i - 1)){
                flag = false;
            }
        }
        return flag;
    }

    public static void validateChapter(String data){
        StringTokenizer stPoint = new StringTokenizer(data,".");
        while (stPoint.hasMoreTokens()){
            String phrase = stPoint.nextToken();
            StringTokenizer wordPoint = new StringTokenizer(phrase," ");
            // check length
            if(wordPoint.countTokens() >=3 && wordPoint.countTokens() <=5){
                System.out.println(phrase);
            }
            else{
                boolean isPolindrom = false;
                while (stPoint.hasMoreTokens()){
                    String word = stPoint.nextToken();
                    if(check(word)){
                        isPolindrom = true;
                    }
                }

                if(isPolindrom)
                    System.out.println(phrase);
            }
        }
    }
//    5)Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака:
//            * Пример: "string" → "ri", "code" → "od", "Practice"→"ct".

    public static void middleSymbols(String[] words) {
        for (String s1:words) {
            if (s1.length() % 2 == 0) {
                System.out.println(s1.substring(s1.length() / 2 - 1, s1.length() / 2 + 1));
            } else {
                System.out.println("Нечетное количество символов в строке");
            }
        }



    }

    //8*(Можно не делать!))Найти количество слов, содержащих только символы латинского алфавита. Пример:
    // * "Методы доступа называют ещё аксессорами (от англ. access — доступ), или по отдельности — геттерами (англ. get — чтение) and сеттерами (англ. set — запись)"

    public static int latinWords(String text) {


        text = text.replaceAll("[^a-zA-Z0-9 ]", "");

        StringTokenizer st = new StringTokenizer(text," ");
        return st.countTokens();

    }


}


// * 4) Есть строка в которой содержится текст, предложения разделены точками.
// * После запуска программы на экран должны выводиться только те предложения в которых от 3-х до 5-ти слов.
// * Если в предложении присутствует слово-палиндром, то не имеет значения какое количество слов в предложении, оно выводится на экран.
// * Пишем все в ООП стиле.
// * 1. Метод принимает строку и возвращает кол-во слов в строке.
// * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
// * В main создаем строку с текстом, также можно текст задавать с консоли.
// * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
// * Если подходит, то выводим на экран.
// * <p>
// * 5)Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака:
// * Пример: "string" → "ri", "code" → "od", "Practice"→"ct".
// * <p>
// *
// * 7) Даны строки разной длины c четным числом символов(казаки, просмотреть, диванчик, малярный),
// * необходимо вернуть ее два средних знака.
// * Например, если дана строка "string"  результат будет "ri", для строки "code" результат "od",  для "Practice" результат "ct".
// * <p> = 5)



