package com.example.creationaldesignpatterns.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    // Configuring the sedan bean using the CarFactory
    @Bean
    public CarFactory sedan() {
        return new CarFactory("sedan");
    }

    // Configuring the SUV bean using the CarFactory
    @Bean
    public CarFactory suv() {
        return new CarFactory("suv");
    }
}
