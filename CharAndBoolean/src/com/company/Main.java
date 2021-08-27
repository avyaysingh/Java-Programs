package com.company;

public class Main {

    public static void main(String[] args) {
        // A char occupies two byes of memory, or 16 bits and thus has a width of 16.The reason
        //it's not just a single byte is that it allows us to store Unicode characters.

        // Unicode is an international encoding standard for use with different languages and scripts,
        // by which each letter, digit or symbol is assigned a unique numeric value that applies across
        // different platforms and programs

        char myChar = 'D';
        char myUnicode = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicode);
        char mycopyright = '\u00A9';
        System.out.println(mycopyright);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

    }
}
