package com.example.creationaldesignpatterns.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    private final Singleton singleton;

    @Autowired
    public Service(Singleton singleton) {
        this.singleton = singleton;
    }
    public void performOperationsWithSingleton() {
        System.out.println("Performing operations with the Singleton instance");
    }

    public Singleton getSingletonInstance() {
        return singleton;
    }
}
