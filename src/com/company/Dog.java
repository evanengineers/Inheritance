package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);  //super keyword means to call the constructor from the class which we are extending from.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("dog.chew called");
    }

    public void walk() {
        System.out.println("dog.walk called");
        move(5);
    }

    public void run() {
        System.out.println("dog.run called");
        move(10);
    }

    //Here is an example of overriding.....we going to override the eat method from the animal class to use the chew method above.


    @Override
    public void eat() {
        chew();
        super.eat();
    }
}
