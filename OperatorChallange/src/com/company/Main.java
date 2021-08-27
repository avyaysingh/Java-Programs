package com.company;

public class Main {

    public static void main(String[] args) {

        double doubleOne = 20.00d;
        double doubleTwo = 80.00d;

        double total = 100.00d * (doubleOne + doubleTwo);
        System.out.println("total value = " + total);
        double reamainder = total % 40.00d;
        System.out.println("remainder value = " + reamainder);
        boolean isNoRemainder = (reamainder == 0) ? true : false;
        System.out.println("isNoremainder = " + isNoRemainder);
        if(!isNoRemainder){
            System.out.println("got some remainder");
        }
    }
}
