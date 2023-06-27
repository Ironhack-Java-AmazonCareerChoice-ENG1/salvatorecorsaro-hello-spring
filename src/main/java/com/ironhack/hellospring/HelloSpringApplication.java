package com.ironhack.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication implements CommandLineRunner {

    @Autowired
    private MyCustomLogger logger;

    @Autowired
    private AlarmService alarmService;

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.log("Hello Spring");
        alarmService.countdown(5);
    }
}
