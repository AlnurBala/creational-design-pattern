package com.example.creationaldesignpatterns.abstractFactory.engine;

import com.example.creationaldesignpatterns.abstractFactory.engine.Engine;

public class SuvEngine implements Engine {
    @Override
    public void start() {
        System.out.println("SUV engine started");
    }
}
