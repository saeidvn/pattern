package com.solvd.pattern.builder;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        MobilePhone mobilePhone = MobilePhone.builder()
                .manufacturer("BlackBerry")
                .model("KEY2 LE")
                .os("Android 8.1 (Oreo)")
                .releaseYear(LocalDate.of(2018, 8, 1).atStartOfDay())
                .gpu("Adreno 509")
                .build();

        System.out.println(mobilePhone);
    }
}
