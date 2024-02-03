package com.example.creationaldesignpatterns.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Singleton singleton() {
        return Singleton.getInstance();
    }
}
