package com.kenIT;

public class UpCasting {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal1 = cat;
        Animal animal2 = (Animal) cat;
        animal1.eating();
        cat.meow();
        cat.eating();
        animal2.eating();


    }
}
