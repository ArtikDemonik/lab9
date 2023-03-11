package org.example;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("pink");
        Veterinarian vet = new Veterinarian();
        vet.treatAnimal(horse);
    }
}

