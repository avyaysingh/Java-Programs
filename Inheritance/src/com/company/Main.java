package com.company;

public class Main {

    public static void main(String[] args) {
        Animal aminal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("vk",7,45,2,4,1,20,"white silky");
        dog.eat();
//        dog.walk();
        dog.run();
    }
}
