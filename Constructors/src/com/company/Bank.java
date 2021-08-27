package com.company;

public class Bank {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Bank(){
        this(123456,1200d,"dfault name", "xyz@gmail.com","9097xyz");
        System.out.println("empty constructor called");
    }
    public Bank(int accountNumber, double balance, String name, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public Bank(String name, String email, String phoneNumber) {
        this(123333,100d,name,email,phoneNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFund(double amount){
        this.balance += amount;
        System.out.println("amount after deposit : " + this.balance);
    }

    public void withdrawFund(double amount){
        if(this.balance -amount < 0){
            System.out.println("Insufficient fund can't withdraw");
        }
        else {
            this.balance -= amount;
        }
        System.out.println("Amount after withdrawal : " + this.balance);
    }
}
