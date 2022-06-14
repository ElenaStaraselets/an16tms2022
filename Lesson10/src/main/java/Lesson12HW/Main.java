package Lesson12HW;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        serialisation();
    }

    /*
     * 1)В исходном файле hw1/input.txt находятся слова, каждое слово на новой строке.
     * После запуска программы должен создать файл output.txt, который будет содержать в себе только палиндромы.
     * */
    private static void task1(){
        try  {
            Pattern regex = Pattern.compile("[0-9]");

            BufferedReader br = new BufferedReader(new FileReader("C:\\____TMS\\an16tms2022\\Lesson10\\src\\main\\java\\Lesson12HW\\hw1\\input.txt"));

            File file = new File("C:\\____TMS\\an16tms2022\\Lesson10\\src\\main\\java\\Lesson12HW\\hw1\\output.txt");

            FileWriter filewriter = new FileWriter(file);

            String line;
            while ((line = br.readLine()) != null) {
                if(TextFormatter.isPolindrom(line) && line.length()>1 && !regex.matcher(line).find()){
                    filewriter.write(line);
                    filewriter.write("\n");

                }

            }

            filewriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    /*
     * 2)Текстовый файл hw2/input.txt содержит текст.
     * После запуска программы в другой файл должны записаться только те предложения, в которых от 3-х до 5-ти слов.
     * Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в output.txt файл.
     * Пишем все в ООП стиле. Создаем класс TextFormatter
     * в котором два метода:
     * 1. Метод принимает строку и возвращает кол-во слов в строке.
     * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
     * В main считываем файл.
     * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
     * Если подходит добавляем его в output.txt файл
     * */
    private static void task2(){
        try  {
            //**** ready streams
            BufferedReader br = new BufferedReader(new FileReader("C:\\____TMS\\an16tms2022\\Lesson10\\src\\main\\java\\Lesson12HW\\hw2\\input.txt"));

            File file = new File("C:\\____TMS\\an16tms2022\\Lesson10\\src\\main\\java\\Lesson12HW\\hw2\\output.txt");

            FileWriter filewriter = new FileWriter(file, false);// создаем новый всегда

            //******************************************
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            // весь текст как одна строка
            String fullText = sb.toString();
            // заменить все переводы строк на пробелы
            fullText = fullText.replace("\n"," ");
            // убираем переносы слов
            fullText = fullText.replace("-","");

            //получаем предложения - делим по точкам
            StringTokenizer st = new StringTokenizer(fullText, ".!?");
            while (st.hasMoreTokens()){
                //одно предложение
                String singlePart = st.nextToken();

                if((TextFormatter.getWordCountStringLength(singlePart) >= 3 && TextFormatter.getWordCountStringLength(singlePart) <=5) // проверка по длине
                        || TextFormatter.checkPolindroms(singlePart)){ // проверка по полиндромам
                    // выводим в выходной поток
                    filewriter.write(singlePart);
                    filewriter.write(".");
                    filewriter.write("\n");
                }
            }

            // закрываем writer
            filewriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * 3) Проверка на цензуру:
     * Создаете 2 файла.
     * 1 - й. Содержит исходный текст.
     * 2 - й. Содержит слова недопустимые в тексте (black list). Структура файла определите сами, хотите каждое слово на новой строке, хотите через запятую разделяйте.
     * Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не встретилось ни одного недопустимого слова, то выводите сообщение о том что текст прошел проверку на цензуру.
     * Если нет, то выводите соответствующее сообщение, кол-во предложений не прошедших проверку и сами предложения подлежащие исправлению.
     * */

    private static void task3(){
        try  {
            //**** ready streams
            BufferedReader brText= new BufferedReader(new FileReader("C:\\____TMS\\an16tms2022\\Lesson10\\src\\main\\java\\Lesson12HW\\hw3\\input.txt"));
            BufferedReader brCensor = new BufferedReader(new FileReader("C:\\____TMS\\an16tms2022\\Lesson10\\src\\main\\java\\Lesson12HW\\hw3\\censor.txt"));

            // load all censored words in set
            Set censored = new HashSet<String>();
            String line;
            while ((line = brCensor.readLine()) != null) {
                censored.add(line.trim());
            }


            //******************************************
            StringBuffer sb = new StringBuffer();
            while ((line = brText.readLine()) != null) {
                sb.append(line);
            }
            // весь текст как одна строка
            String fullText = sb.toString();
            // заменить все переводы строк на пробелы
            fullText = fullText.replace("\n"," ");

            int incorrectPhrasesCnt = 0;
            String incorrectPhrasesStr = "";
            // разделяем текст на предложения
            StringTokenizer st = new StringTokenizer(fullText, ".");
            while (st.hasMoreTokens()){
                String singlePart = st.nextToken();
                // В каждом предложении разделяем на слова

                StringTokenizer stWord = new StringTokenizer(singlePart, " ");
                while (stWord.hasMoreTokens()){
                    String oneWord = stWord.nextToken();
                    if(censored.contains(oneWord)) {
                        incorrectPhrasesCnt++;
                        incorrectPhrasesStr += singlePart + ".\n";
                        break;
                    }
                }
            }
            if(incorrectPhrasesCnt == 0){
                System.out.println("Текст прошел проверку на цензуру");
            }
            else{
                System.out.println("Цензура не пройдена. Количество предложений, не прошедших проверку "+ incorrectPhrasesCnt);
                System.out.print(incorrectPhrasesStr);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        4) Сериализовать объект Автомобиль(Марка, Двигатель(тип двигателя, количество цилиндров), бак(тип топлива, объем), скорость, цена). Количество цилиндров не должно сереализоватся в файл(это конфедициальная информация)
//     * После сериализации произвести обратный процесс(из потока в объект) и вывести на консоль

    }

    public static void serialisation(){
        Engine engine= new Engine("Diesel",4);
        Tank t = new Tank("diesel",50);
        Car c = new Car("Audi", 120,10000,engine,t);
        System.out.println(c.toString());

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.ser"));
            oos.writeObject(c);

            FileInputStream streamIn = new FileInputStream("car.ser");
            ObjectInputStream objectinputstream = new ObjectInputStream(streamIn);
            Car loadedCar = (Car)objectinputstream.readObject();

            System.out.println(loadedCar.toString());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    /**
     * 1)В исходном файле hw1/input.txt находятся слова, каждое слово на новой строке.
     * После запуска программы должен создать файл output.txt, который будет содержать в себе только палиндромы.
     * 2)Текстовый файл hw2/input.txt содержит текст.
     * После запуска программы в другой файл должны записаться только те предложения, в которых от 3-х до 5-ти слов.
     * Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в output.txt файл.
     * Пишем все в ООП стиле. Создаем класс TextFormatter
     * в котором два метода:
     * 1. Метод принимает строку и возвращает кол-во слов в строке.
     * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
     * В main считываем файл.
     * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
     * Если подходит добавляем его в output.txt файл
     * 3) Проверка на цензуру:
     * Создаете 2 файла.
     * 1 - й. Содержит исходный текст.
     * 2 - й. Содержит слова недопустимые в тексте (black list). Структура файла определите сами, хотите каждое слово на новой строке, хотите через запятую разделяйте.
     * Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не встретилось ни одного недопустимого слова, то выводите сообщение о том что текст прошел проверку на цензуру.
     * Если нет, то выводите соответствующее сообщение, кол-во предложений не прошедших проверку и сами предложения подлежащие исправлению.
     * 4) Сериализовать объект Автомобиль(Марка, Двигатель(тип двигателя, количество цилиндров), бак(тип топлива, объем), скорость, цена). Количество цилиндров не должно сереализоватся в файл(это конфедициальная информация)
     * После сериализации произвести обратный процесс(из потока в объект) и вывести на консоль
     * 5) Задача со *
     * Скопировать объект Car из пакета hw5, добавить библиотеки
     * https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.12.3
     * https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.12.3
     * https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.12.3
     * через maven в проект. Далее вычитать данные в json формате из файла (hw5/car.json), руками файл изменять нельзя!
     * Преобразовать прочитанные данные в объект hw5.Car (название полей редактировать нельзя, добавлять поля также нельзя) и вывести на консоль объект через System.out.println();
     *
     */

}
