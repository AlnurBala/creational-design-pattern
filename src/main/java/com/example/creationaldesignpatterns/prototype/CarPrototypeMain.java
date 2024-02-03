package com.example.creationaldesignpatterns.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CarPrototypeMain {
    private String make;
    private String model;
    private int year;
    private String color;

    // Public constructor
    public CarPrototypeMain() {
    }

    // Getter and setter methods for Car properties

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Clone method to create a copy of the object
    public CarPrototypeMain clone() {
        CarPrototypeMain clone = new CarPrototypeMain();
        clone.setMake(this.make);
        clone.setModel(this.model);
        clone.setYear(this.year);
        clone.setColor(this.color);
        return clone;
    }
}
