package com.solvd.pattern.observer;

public class Main {

    public static void main(String[] args) {
        ReleaseHolder releaseHolder = new ReleaseHolder();

        releaseHolder.follow(DeviceType.TWEETER, new User("Alex", "BlackBerry","KEY2 LE"));
        releaseHolder.follow(DeviceType.TWEETER, new User("Jack", "Apple","Ipad4"));
        releaseHolder.follow(DeviceType.INSTAGRAM, new User("Tom", "BlackBerry","Evolve"));
        releaseHolder.follow(DeviceType.INSTAGRAM, new User("Ray", "Apple","Ipad5"));

        releaseHolder.notify(DeviceType.TWEETER, "New release on store.");
        releaseHolder.notify(DeviceType.INSTAGRAM, "New release on store.");
    }
}
