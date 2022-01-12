package com.solvd.pattern.factory;

public abstract class MobileFactory {

    public static IMobile create(Mobile manufacturer) {
        IMobile mobile = null;

        switch (manufacturer) {
            case BLACKBERRY:
                mobile = new BlackBerry();
                break;
            case NOKIA:
                mobile = new Nokia();
                break;
            default:
                break;
        }
        return mobile;
    }
}
