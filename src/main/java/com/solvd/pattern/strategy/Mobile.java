package com.solvd.pattern.strategy;

public class Mobile {

    public static void main(String[] args) {
        ElectronicDevice blackBerry = new ElectronicDevice(new MobilePhone());
        blackBerry.toUse();

        ElectronicDevice ipad = new ElectronicDevice(new Tablet());
        ipad.toUse();
    }
}
