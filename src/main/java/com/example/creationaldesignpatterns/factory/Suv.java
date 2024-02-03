package com.example.creationaldesignpatterns.factory;

public class Suv implements Car{
    @Override
    public void drive() {
        System.out.println("Driving an SUV");
    }
}
