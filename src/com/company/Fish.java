package com.company;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {


    }

    public void swim(int speed) {
        moveMucsles();
        moveBackFin();
        super.move(speed);
    }

    public void moveMucsles() {

    }

    public void moveBackFin(){

    }

    public int getGills() {
        return gills;
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }
}
