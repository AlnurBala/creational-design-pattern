package com.example.creationaldesignpatterns.factory;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<Car> {
    private String carType;

    public CarFactory(String carType) {
        this.carType = carType;
    }

    @Override
    public Car getObject() throws Exception {
        if ("sedan".equalsIgnoreCase(carType)) {
            return new Sedan();
        } else if ("suv".equalsIgnoreCase(carType)) {
            return new Suv();
        } else {
            throw new IllegalArgumentException("Invalid car type: " + carType);
        }
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
