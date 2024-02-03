package com.example.creationaldesignpatterns.abstractFactory.engine;

import com.example.creationaldesignpatterns.abstractFactory.engine.Engine;

public class SedanEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Sedan engine started");
    }
}
