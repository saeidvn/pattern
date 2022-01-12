package com.solvd.pattern.factory;

public class BlackBerry implements IMobile {

    @Override
    public void turnOn() {
        System.out.println("BlackBerry is turned on.");
    }

    @Override
    public void unlock() {
        System.out.println("BlackBerry is unlocked.");
    }

    @Override
    public void alarm() {
        System.out.println("BlackBerry's alarm is turned on.");
    }
}
