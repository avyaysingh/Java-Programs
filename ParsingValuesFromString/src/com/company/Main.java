package com.company;

public class Main {

    public static void main(String[] args) {
        String numberString = "2020";
        System.out.println("number as string = "+ numberString);

        int number = Integer.parseInt(numberString);
        System.out.println(number);

        numberString += 1;
        number += 1;
        System.out.println("number as string = "+ numberString);
        System.out.println(number);
    }
}
