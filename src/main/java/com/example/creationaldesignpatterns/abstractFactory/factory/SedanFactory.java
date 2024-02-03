package com.example.creationaldesignpatterns.abstractFactory.factory;

import com.example.creationaldesignpatterns.abstractFactory.cars.Car;
import com.example.creationaldesignpatterns.abstractFactory.cars.Sedan;
import com.example.creationaldesignpatterns.abstractFactory.engine.Engine;
import com.example.creationaldesignpatterns.abstractFactory.engine.SedanEngine;
import com.example.creationaldesignpatterns.abstractFactory.factory.CarFactory;

public class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public Engine createEngine() {
        return new SedanEngine();
    }
}
