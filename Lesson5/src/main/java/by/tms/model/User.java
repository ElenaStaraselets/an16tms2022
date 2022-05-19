package by.tms.model;

/**
 *
 * 1) Создать класс User для хранения о обработки данных о пользователе.
 * Создать поля для хранения имени и фамилии, возраста и пола. Создать методы для:
 *  - Возврата имени и фамилии полностью
 *  - Увеличения возраста
 *  - Вывода общей информации о пользователе
 *  В Main классе в методе main создайте экземпляр класса User и вызовите все созданные методы, передав им необходимые параметры.
 * 2) Создать в классе User несколько конструкторов. Создать объект этого класса, использовав один из них.
 * В этом конструкторе сделать вызов другого конструктора этого же класса.
 * Отметьте один из методов как @Deprecated. Попробуйте на экземпляре класса вызвать этот метод.
 */
public class User {
    private String name;
    private String familyName;
    private int age;
    private String sex;

    public User(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    public User(String name, String familyName, int age, String sex) {
        this(name, familyName);
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void increaseAge(){
        age++;
    }

    @Deprecated
    public void decreaseAge(){
        age--;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
