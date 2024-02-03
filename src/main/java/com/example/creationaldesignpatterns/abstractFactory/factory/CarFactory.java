package com.example.creationaldesignpatterns.abstractFactory.factory;

import com.example.creationaldesignpatterns.abstractFactory.cars.Car;
import com.example.creationaldesignpatterns.abstractFactory.engine.Engine;

public interface CarFactory {
    Car createCar();
    Engine createEngine();
}
