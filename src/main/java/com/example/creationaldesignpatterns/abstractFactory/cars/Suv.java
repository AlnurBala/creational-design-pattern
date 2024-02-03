package com.example.creationaldesignpatterns.abstractFactory.cars;

import com.example.creationaldesignpatterns.abstractFactory.cars.Car;

public class Suv implements Car {
    @Override
    public void drive() {
        System.out.println("Driving an SUV");
    }
}
