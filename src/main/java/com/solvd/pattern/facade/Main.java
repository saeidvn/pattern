package com.solvd.pattern.facade;

public class Main {

    public static void main(String[] args) {

        SystemUpdate systemUpdate = new SystemUpdate();
        Sound sound = new Sound();
        Keyboard keyboard = new Keyboard();

        Mobile mobile = new Mobile(systemUpdate, sound, keyboard);

        mobile.mobileSystemCheck();
    }
}
