package com.solvd.pattern.observer;

public class User implements Release {

    private String name;
    private String device;
    private String model;

    public User(String name, String device , String model) {
        this.name = name;
        this.device = device;
        this.model = model;
    }

    @Override
    public void update(String message) {
        System.out.println(String.format("Name: %s Device: %s; Model: %s; Message: %s;", name, device, model, message));
    }

    public String getName() {
        return name;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
