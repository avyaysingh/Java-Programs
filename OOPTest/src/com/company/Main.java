package com.company;

public class Main {

    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("Basic", "chicken", 3.44,"white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato",0.34);
        hamburger.addHamburgerAddition2("onion", .22);
        hamburger.addHamburgerAddition3("cheese", 1.12);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",4.65);
        healthyBurger.addHamburgerAddition1("egg",5.43);
        healthyBurger.addHealthAddition1("Lentils",3.41);
        System.out.println("total Healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("should not do this", 50.76);
        deluxeBurger.itemizeHamburger();
    }
}
