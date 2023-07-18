package org.factory;

import org.factory.service.ProfileService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FactoryApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FactoryApplication.class, args);
        ProfileService profileService = context.getBean("profileService", ProfileService.class);
    }
}