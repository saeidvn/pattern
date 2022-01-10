package com.solvd.pattern.factory;

public class Nokia implements MobileImpl {

    @Override
    public void turnOn() {
        System.out.println("Nokia is turned on.");
    }

    @Override
    public void unlock() {
        System.out.println("Nokia is unlocked.");
    }

    @Override
    public void alarm() {
        System.out.println("Nokia alarm is turned on.");
    }
}
