package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("z123","zebronics","240",dimensions);
        Monitor monitor = new Monitor("swift3","samsung",35,new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("zest-ultra","asus",4,4,"v2.44");
        PC thePc = new PC(theCase, monitor, motherboard);

        thePc.powerUp();

    }
}
