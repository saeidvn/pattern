package com.solvd.pattern.factory;

public abstract class MobileFactory {

    public static MobileImpl create(Mobile manufacturer) {
        MobileImpl mobile = null;

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
