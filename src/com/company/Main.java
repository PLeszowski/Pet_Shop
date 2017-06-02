package com.company;

public class Main {

    public static void main(String[] args) {

        Worker w1 = new Worker("Ala");
        Worker w2 = new Worker("Ola");
        Worker w3 = new Worker("Ela");
        Manager m1 = new Manager("Asia");
        Manager m2 = new Manager("Eva");

        System.out.println(Worker.getNumOfWorkers());
        System.out.println(Manager.getNumOfManagers());

    }
}
