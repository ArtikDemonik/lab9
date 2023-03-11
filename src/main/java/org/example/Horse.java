package org.example;

public class Horse extends Animal {
    private String maneColor;
    Horse(String maneColor){
        this.food = "hay";
        this.location = "steppe";
        this.maneColor = maneColor;
    }
    @Override
    public void makeNoise() {
        System.out.println("Horse neighs");
    }

    @Override
    public void eat() {
        System.out.println("Horse eats hay");
    }
}
