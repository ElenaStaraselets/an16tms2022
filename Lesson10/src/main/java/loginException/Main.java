package loginException;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин (до 20 символов, латинские буквы, цифры и знак подчеркивания)");
        String login = in.nextLine();
        System.out.println("Введите пароль (до 20 символов, латинские буквы, цифры и знак подчеркивания)");
        String password = in.nextLine();
        System.out.println("Введите подтверждение пароля (до 20 символов, латинские буквы, цифры и знак подчеркивания)");
        String confirmPassword = in.nextLine();

        checkAuthorization(login, password, confirmPassword);


    }
    static boolean checkAuthorization(String login, String password, String confirmPassword)  {

        try {
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают");
            }

            if (!checkParam(login)) {
                throw new WrongLoginException("Логин не соответствует требованиям");
            }
            if (!checkParam(password)) {
                throw new WrongPasswordException("Пароль не соответствует требованиям");
            }
        }catch (WrongPasswordException wpe){
            System.out.println("WrongPasswordException " + wpe.getMessage());
            return false;
        }
        catch (WrongLoginException wle){
            System.out.println("WrongLoginException " + wle.getMessage());
            return false;
        }
        return true;
    }

    static boolean checkParam(String data){
        Pattern regex = Pattern.compile("[^A-Za-z0-9_]");

        return data.trim().length() !=0 && data.trim().length() <= 20 && !regex.matcher(data).find();
    }
}
/**
 * Создать статический метод "checkAuthorization" который будет вызваться из метода main и принимает на вход три параметра: login, password и confirmPassword. Поле login должен содержать:
 * - Tолько латинские буквы, цифры и знак подчеркивания.
 * - Длина login должна быть меньше 20 символов.
 * (Если не знаете как проверить первое условие, то проверяем только 2 условие - вызваем метод lenght())
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Password должен содержать:
 * - Только латинские буквы, цифры и знак подчеркивания.
 * -  Длина password должна быть меньше 20 символов.
 * (Если не знаете как проверить первое условие, то проверяем только 2 условие - вызваем метод lenght())
 * Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
 * второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Обработка исключений проводится внутри метода "checkAuthorization".
 * Используем multi-catch block. Метод "checkAuthorization" возвращает true, если значения верны или false в другом случае.
 * В методе main вызваем метод checkAuthorization и печатаем на консоль результат выполнения метода.
 *
 * PS: если не знаем как сделать проверку, то можно просто оставить пустую реализацию! Прорабатываем работу с исключениями
 */