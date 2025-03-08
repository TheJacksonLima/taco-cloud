package com.jfl.taco_cloud;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartUpListener {

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
        System.out.println("\n".repeat(1));
        System.out.println("-".repeat(50));
        System.out.println("Spring Boot application is running!");
        System.out.println("Access the app at: http://localhost:8081");
        System.out.println("-".repeat(50));
        System.out.println("\n".repeat(1));
    }
}
