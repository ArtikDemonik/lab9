package org.example;

public class Cat extends Animal {
    private String furColor;
    Cat(String furColor){
        this.food = "milk";
        this.location = "home";
        this.furColor = furColor;
    }
    @Override
    public void makeNoise() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }
}
