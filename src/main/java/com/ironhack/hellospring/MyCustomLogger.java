package com.ironhack.hellospring;

import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Component
public class MyCustomLogger {

    public void log(LogType type, String text){
        System.out.printf("%s | %s | %s \n", ZonedDateTime.now(), type, text);
    }

    public void log(String text){
        log(LogType.INFO, text);
    }
}
