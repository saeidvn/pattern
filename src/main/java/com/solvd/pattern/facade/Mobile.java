package com.solvd.pattern.facade;

public class Mobile {

    private final SystemUpdate systemUpdate;
    private final Sound sound;
    private final Keyboard keyboard;

    public Mobile(SystemUpdate systemUpdate, Sound sound, Keyboard keyboard) {
        this.systemUpdate = systemUpdate;
        this.sound = sound;
        this.keyboard = keyboard;
    }

    public void mobileSystemCheck() {
        systemUpdate.checkUpdate();
        sound.checkSound();
        keyboard.checkKeyboard();
    }
}
