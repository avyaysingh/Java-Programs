package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "mutton & chicken ",20.33, "multi-grain");
        super.addHamburgerAddition1("Chips",2.4);
        super.addHamburgerAddition2("Drink",3.57);
    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can't add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can't add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can't add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can't add additional items to a deluxe burger");
    }
}
