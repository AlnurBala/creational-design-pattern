package com.example.creationaldesignpatterns.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Using Spring application context to get the car instance
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Requesting a sedan from the factory
        Car sedan = (Car) context.getBean("sedan");
        sedan.drive();

        // Requesting an SUV from the factory
        Car suv = (Car) context.getBean("suv");
        suv.drive();
    }
}
