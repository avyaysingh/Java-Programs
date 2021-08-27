package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Avyay",34.55);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(44.97);
        System.out.println("Balance for customer: " + customer.getName() + " is " + customer.getBalance());
        System.out.println("Balance of another customer is: " + anotherCustomer.getBalance());


        ArrayList<Integer>  intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        for (int i=0; i<intList.size(); i++){
            System.out.println(i +" -> " + intList.get(i));
        }

        intList.add(1,40);
        for (int i=0; i<intList.size(); i++){
            System.out.println(i +" -> " + intList.get(i));
        }
    }
}
