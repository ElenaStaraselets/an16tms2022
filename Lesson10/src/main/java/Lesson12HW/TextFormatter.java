package Lesson12HW;

import java.util.StringTokenizer;

public class TextFormatter {
    public static int getWordCountStringLength(String str){
        StringTokenizer st = new StringTokenizer(str, " ");
        return st.countTokens();
    }
    public static boolean checkPolindroms(String str){
        boolean hasPolindrom = false;
        StringTokenizer st = new StringTokenizer(str, " ");
        while(st.hasMoreTokens()){
            if(isPolindrom(st.nextToken()))
                hasPolindrom = true;
        }
        return hasPolindrom;
    }

    public static boolean isPolindrom(String w1){

        // вывидываем слова из одной буквы
        if(w1.length() == 1)
            return false;

        boolean flag = true;

        for (int i = 0; i < w1.length()/2; i++){
            if(w1.charAt(i) != w1.charAt(w1.length() - i - 1)){
                flag = false;
            }
        }
        return flag;
    }

}
