package com.solvd.pattern.strategy;

public class MobilePhone implements Keyboard {

    @Override
    public void use() {
        System.out.println("BlackBerry KEY2 LE using touch screen and QWERTY keypad.");
    }
}
