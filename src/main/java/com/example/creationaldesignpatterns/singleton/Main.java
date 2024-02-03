package com.example.creationaldesignpatterns.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);

        Service service = context.getBean(Service.class);

        Singleton singletonInstance = service.getSingletonInstance();
        System.out.println("Main application using the Singleton instance");
        service.performOperationsWithSingleton();
    }
}
