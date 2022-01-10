package com.solvd.pattern.decorator;

public class Main {

    public static void main(String[] args) {

        MobileImpl mobile = new MobileImpl();

        mobile.turnOn();
        mobile.turnOff();
    }
}
