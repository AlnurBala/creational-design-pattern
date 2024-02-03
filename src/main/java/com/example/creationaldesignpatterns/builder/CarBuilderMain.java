package com.example.creationaldesignpatterns.builder;

import org.springframework.stereotype.Component;

public class CarBuilderMain {
    private String make;
    private String model;
    private int year;
    private String color;

    private CarBuilderMain() {
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // Builder class
    @Component
    public static class CarBuilder {
        private CarBuilderMain car;

        public CarBuilder() {
            this.car = new CarBuilderMain();
        }

        public CarBuilder withMake(String make) {
            this.car.make = make;
            return this;
        }

        public CarBuilder withModel(String model) {
            this.car.model = model;
            return this;
        }

        public CarBuilder withYear(int year) {
            this.car.year = year;
            return this;
        }

        public CarBuilder withColor(String color) {
            this.car.color = color;
            return this;
        }

        public CarBuilderMain build() {
            return this.car;
        }
    }
}
