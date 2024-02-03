package com.example.creationaldesignpatterns.builder;

public class Main {
    public static void main(String[] args) {
        // Using the CarBuilder to construct a Car
        CarBuilderMain.CarBuilder carBuilder = new CarBuilderMain.CarBuilder();
        CarBuilderMain car = carBuilder
                .withMake("Toyota")
                .withModel("Camry")
                .withYear(2022)
                .withColor("Blue")
                .build();

        // Accessing the constructed Car
        System.out.println("Constructed Car: " + car.getMake() + " " + car.getModel() +
                " (" + car.getYear() + ") - Color: " + car.getColor());
    }
}
