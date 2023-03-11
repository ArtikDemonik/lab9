package org.example;

public class Dog extends Animal {
    private String breed;
    Dog(String breed){
        this.food = "meat";
        this.location = "street";
        this.breed = breed;
    }
    @Override
    public void makeNoise() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }
}
