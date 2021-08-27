package com.company;

public class Main {

    public static void main(String[] args) {
        Bank avyay = new Bank(35409469, 10000d, "Avyay Kumar Singh", "shubhamsinghak1234@gmail.com","9097821409");
        System.out.println("Bank constructors with parameters called");
        System.out.println("Name : " + avyay.getName());
        System.out.println("A/c No. : " + avyay.getAccountNumber());
        System.out.println("Email id : " + avyay.getEmail());
        System.out.println("Phone : " + avyay.getPhoneNumber());
        System.out.println("Balance : " + avyay.getBalance());

        avyay.depositFund(50000d);
        avyay.depositFund(70000d);

        VipCustomer shubham = new VipCustomer();
        System.out.println(shubham.getName());

        VipCustomer person2 = new VipCustomer("shubh",25500);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("avyay",45000.00,"shubhamsinghak1234@gmail.com");
        System.out.println(person3.getName());
    }
}
