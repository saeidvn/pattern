package com.solvd.pattern.observer;

import java.util.*;

public class ReleaseHolder {

    private static final Map<DeviceType, List<User>> listeners = new HashMap<>();

    public ReleaseHolder() {
        Arrays.stream(DeviceType.values())
                .forEach(type -> listeners.put(type ,new ArrayList<>()));
    }

    public void follow(DeviceType type, User electronicDevice) {
        List<User> electronicDevices = listeners.get(type);
        electronicDevices.add(electronicDevice);
    }

    public void unfollow(DeviceType type, User electronicDevice) {
        List<User> electronicDevices = listeners.get(type);
        electronicDevices.add(electronicDevice);
    }

    public void notify(DeviceType type, String message) {
        List<User> electronicDevices = listeners.get(type);
        electronicDevices.forEach(electronicDevice -> electronicDevice.update(message));
    }
}
