package com.solvd.pattern.decorator;

public class MobileImpl implements Mobile{

    @Override
    public void turnOn() {
        System.out.println("Mobile phone is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Mobile phone is turned off.");
    }
}
