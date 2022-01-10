package com.solvd.pattern.builder;

import java.time.LocalDateTime;

public class MobilePhone {

    private String manufacturer;
    private String model;
    private String os;
    private LocalDateTime releaseYear;
    private String gpu;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getOs() {
        return os;
    }

    public LocalDateTime getReleaseYear() {
        return releaseYear;
    }

    public String getGpu() {
        return gpu;
    }

    public static Builder builder() {
        return new Builder(new MobilePhone());
    }

    public static class Builder {

        private final MobilePhone mobilePhone;

        private Builder(MobilePhone mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public Builder manufacturer(String manufacturer) {
            mobilePhone.manufacturer = manufacturer;
            return this;
        }

        public Builder model(String model) {
            mobilePhone.model = model;
            return this;
        }

        public Builder os(String os) {
            mobilePhone.os = os;
            return this;
        }

        public Builder releaseYear(LocalDateTime releaseYear) {
            mobilePhone.releaseYear = releaseYear;
            return this;
        }

        public Builder gpu(String gpu) {
            mobilePhone.gpu = gpu;
            return this;
        }

        public MobilePhone build() {
            return mobilePhone;
        }
    }
}
