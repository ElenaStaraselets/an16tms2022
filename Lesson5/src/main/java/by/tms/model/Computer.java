package by.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private String ram;
    private String hdd;
    private int circleCount = 0;
    private boolean computerBurned = false;
    private static final int SWITCH_LIMIT = 20;

    public Computer(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.circleCount = 0;
        this.computerBurned = false;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", circleCount=" + circleCount +
                '}';
    }

    public boolean isComputerBurned() {
        return computerBurned;
    }

    public void on(){
        if(computerBurned){
            System.out.println("Компьютер сгорел!");
        }
        else {
            System.out.println("Внимание! Введите 0 или 1");
            /// read val
            Scanner console = new Scanner(System.in);
            int iVal = 0;
            iVal = Integer.parseInt(console.nextLine());

            Random rand = new Random();
            // берем остаток от деления на 2 - получаем 0 или 1
            int rndVal = rand.nextInt() % 2;

            if (iVal != rndVal) {
                computerBurned = true;
            }
        }
    }

    public void off() {


        if (computerBurned) {
            System.out.println("Компьютер сгорел!");
        } else {
            circleCount++;
            if(circleCount > SWITCH_LIMIT){
                computerBurned = true;
                System.out.println("Компьютер сгорел!");
            }
        }
    }

    /**
     * в папке src/main/java создать пакет by.tms.model
     * в пакете создать класс Computer
     * 1) класс Computer будет содержать следующие поля:
     * - процессор
     * - оперативка
     * - жесткий диск
     * - ресурс полных циклов работы (включился выключился это один цикл)
     *
     * 2) класс Computer будет содержать следующие методы:
     * - метод описание(вывод всех полей)
     * - метод включить (on())
     *     - при включении может произойти сбой, поэтому при вызове метода on() необходимо написать следующую логику:
     *     на консоль вывести сообщение (Внимание! Введите 0 или 1)
     *     создать экземпляр класса Random, который будет генерировать число 0 или 1.
     *     если введенное вами число совпадет с рандомным, то компьютер выключается.
     *     если введенное вами число не совпадет с рандомным, то компьютер сгорает.
     *     - при повторном включении компьютера, если он сгорел необходимо выдать сообщение "Компьютер сгорел!"
     * - выключить (off()) Проверяем если компьютер не сгорел то пишем "Выключение компьютера" и уменьшаем счетчик
     *    ресурса полных циклов работы
     * - при превышении лимита ресурса комп сгорает. Пишем сообщение "Компьютер сгорел!"
     *
     * 3) создать пакет by.tms.service
     * создать класс Main создать метод main
     * создать экземпляр класса Computer или реальный объект, через конструктор передать значение полей класса,
     * т.е необходимо сгенерировать конструктор с полями класса перечисленными в 1 пункте
     * Далее у объекта Computer вызвать его методы, в которых будет реализована логика по включению, выключению
     * и выводу информации про него.
     */
}
