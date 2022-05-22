package home.military.office;

import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> personArrayList = new ArrayList<Person>();

    public PersonRegistry() {
        personArrayList.add(new Person("Иван", 25,"m","Belarus","Minsk"));
        personArrayList.add(new Person("Петр", 16,"m","Belarus","Minsk"));
        personArrayList.add(new Person("Мария", 21,"f","Belarus","Kobrin"));
        personArrayList.add(new Person("Василий", 29,"m","Belarus","Minsk"));
        personArrayList.add(new Person("Марк", 26,"m","Belarus","Minsk"));
        personArrayList.add(new Person("Аврелий", 30,"m","Belarus","Borisov"));
        personArrayList.add(new Person("Ирина", 18,"f","Belarus","Minsk"));
        personArrayList.add(new Person("Александр", 27,"m","Belarus","Minsk"));
        personArrayList.add(new Person("Аркадий", 23,"m","Belarus","Smolevichi"));

    }

    public ArrayList<Person> getPersonArrayList() {
        return personArrayList;
    }
}
