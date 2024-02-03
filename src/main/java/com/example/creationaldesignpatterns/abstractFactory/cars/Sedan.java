package com.example.creationaldesignpatterns.abstractFactory.cars;

import com.example.creationaldesignpatterns.abstractFactory.cars.Car;

public class Sedan implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a sedan");
    }
}
