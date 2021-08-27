package com.company;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);   //what does super means? to call a constructor that is for the class we're extending from
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() callled");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("dog.walk() called");
        move(10);
    }

    public void run(){
        System.out.println("dog.run() called");
        move(20);
    }

    private void moveLegs(int speed){
        System.out.println("dog.moveLidgs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move called");
        moveLegs(speed);
        super.move(speed);
    }
}
