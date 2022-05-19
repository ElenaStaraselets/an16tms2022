package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("Intel Core i5", "16GB","1TB");
        System.out.println(computer.toString());
        computer.on();
        computer.off();

        if(!computer.isComputerBurned()){
            computer.on();
            computer.off();
        }
        if(!computer.isComputerBurned()){
            computer.on();
            computer.off();
        }
    }
}
