package com.example.creationaldesignpatterns.abstractFactory.factory;

import com.example.creationaldesignpatterns.abstractFactory.cars.Car;
import com.example.creationaldesignpatterns.abstractFactory.cars.Suv;
import com.example.creationaldesignpatterns.abstractFactory.engine.Engine;
import com.example.creationaldesignpatterns.abstractFactory.engine.SuvEngine;
import com.example.creationaldesignpatterns.abstractFactory.factory.CarFactory;

public class SuvFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Suv();
    }

    @Override
    public Engine createEngine() {
        return new SuvEngine();
    }
}
