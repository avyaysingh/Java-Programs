package com.company;

public class VipCustomer {
    private String name;
    private double creditCardLimit;
    private String email;

    public VipCustomer(){
        this("default name",50000,"xxxx@mail.com");
    }
    public VipCustomer(String name, double creditCardLimit){
        this(name, creditCardLimit, "unknown@gmail.com");
    }
    public VipCustomer(String name, double creditCardLimit, String email){
        this.name = name;
        this.creditCardLimit = creditCardLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditCardLimit() {
        return creditCardLimit;
    }

    public String getEmail() {
        return email;
    }
}
