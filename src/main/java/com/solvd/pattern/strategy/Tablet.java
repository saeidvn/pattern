package com.solvd.pattern.strategy;

public class Tablet implements Keyboard{

    @Override
    public void use() {
        System.out.println("Ipad using touch screen.");
    }
}
