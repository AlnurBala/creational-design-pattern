package com.example.creationaldesignpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        // Using the prototype to create new Car instances
        CarPrototypeMain prototypeCar = new CarPrototypeMain();
        prototypeCar.setMake("Toyota");
        prototypeCar.setModel("Camry");
        prototypeCar.setYear(2022);
        prototypeCar.setColor("Blue");

        // Clone the prototype to create a new Car
        CarPrototypeMain newCar1 = prototypeCar.clone();
        newCar1.setColor("Red");

        // Clone the prototype again to create another new Car
        CarPrototypeMain newCar2 = prototypeCar.clone();
        newCar2.setYear(2023);

        // Displaying the properties of the prototype and the new cars
        System.out.println("Prototype Car: " + prototypeCar.getMake() + " " + prototypeCar.getModel() +
                " (" + prototypeCar.getYear() + ") - Color: " + prototypeCar.getColor());

        System.out.println("New Car 1: " + newCar1.getMake() + " " + newCar1.getModel() +
                " (" + newCar1.getYear() + ") - Color: " + newCar1.getColor());

        System.out.println("New Car 2: " + newCar2.getMake() + " " + newCar2.getModel() +
                " (" + newCar2.getYear() + ") - Color: " + newCar2.getColor());
    }
}
