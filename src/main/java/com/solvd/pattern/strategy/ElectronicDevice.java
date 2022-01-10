package com.solvd.pattern.strategy;

public class ElectronicDevice {

    private Keyboard keyboard;

    public ElectronicDevice(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void toUse() {
        this.keyboard.use();
    }

}
