package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteNumber = 122;
        short shortNumber = 12345;

        int integerNumber = 275753;

        long longNumber = 50000L + 10L * (byteNumber + shortNumber + integerNumber);
        System.out.println("the final result is " + longNumber);
    }
}
