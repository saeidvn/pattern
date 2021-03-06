package com.solvd.pattern.factory;

public class Main {

    public static void main(String[] args) {

        IMobile mobile1 = MobileFactory.create(Mobile.BLACKBERRY);
        mobile1.turnOn();
        mobile1.unlock();
        mobile1.alarm();

        IMobile mobile2 = MobileFactory.create(Mobile.NOKIA);
        mobile2.unlock();
        mobile2.unlock();
        mobile2.alarm();
    }
}
