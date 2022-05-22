package home.military.office;

public class Person {
    private String name;
    private int age;
    private String sex;
    private Address address;

    public Person(String name, int age, String sex, String country, String city) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = new Address(country, city);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address=" + address +
                '}';
    }
}
