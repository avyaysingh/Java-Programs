package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("adarsh");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Indian yellow parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("sea");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
