package com.company;

import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 6);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 80, "Silky");

        //All the below methods for dog..are being called from the animal class.
        dog.run();
        dog.eat();
        dog.getName();
        dog.walk();

    }
}
