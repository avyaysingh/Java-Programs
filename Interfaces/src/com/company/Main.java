package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone avyaysPhone;
        avyaysPhone = new DeskPhone(123456);
        avyaysPhone.powerOn();
        avyaysPhone.callPhone(123456);
        avyaysPhone.answer();

        avyaysPhone = new MobilePhone(555666);
        avyaysPhone.powerOn();
        avyaysPhone.callPhone(555666);
        avyaysPhone.answer();
    }
}
