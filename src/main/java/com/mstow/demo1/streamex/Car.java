package com.mstow.demo1.streamex;

import lombok.Data;

@Data
public class Car {
    private final String brand;
    private final String model;

    public static Car of(String brand, String name) {
        return new Car(brand, name);
    }
}
