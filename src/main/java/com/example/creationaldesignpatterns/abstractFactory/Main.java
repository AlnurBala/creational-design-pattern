package com.example.creationaldesignpatterns.abstractFactory;

import com.example.creationaldesignpatterns.abstractFactory.cars.Car;
import com.example.creationaldesignpatterns.abstractFactory.engine.Engine;
import com.example.creationaldesignpatterns.abstractFactory.factory.CarFactory;
import com.example.creationaldesignpatterns.abstractFactory.factory.SedanFactory;
import com.example.creationaldesignpatterns.abstractFactory.factory.SuvFactory;

public class Main {
    public static void main(String[] args) {
        // Creating a Sedan factory
        CarFactory sedanFactory = new SedanFactory();

        // Creating a Sedan and its engine
        Car sedan = sedanFactory.createCar();
        Engine sedanEngine = sedanFactory.createEngine();

        // Using Sedan and its engine
        sedan.drive();
        sedanEngine.start();

        // Creating an SUV factory
        CarFactory suvFactory = new SuvFactory();

        // Creating an SUV and its engine
        Car suv = suvFactory.createCar();
        Engine suvEngine = suvFactory.createEngine();

        // Using SUV and its engine
        suv.drive();
        suvEngine.start();
    }
}
