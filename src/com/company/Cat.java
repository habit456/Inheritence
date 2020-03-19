package com.company;

public class Cat extends Animal {
    int legs;
    int eyes;

    public Cat() {
        this("Default Name", 0, 0, 0, 0);
    }

    public Cat(String name, int size, int weight, int legs, int eyes) {
        super(name, 1, 1, size, weight);
        this.legs = legs;
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
}
