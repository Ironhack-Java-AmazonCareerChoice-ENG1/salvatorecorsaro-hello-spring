package com.ironhack.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlarmService {

    @Autowired
    private MyCustomLogger logger;

    public void countdown(int seconds){
        for (int i = seconds; i >= 0; i--) {
            logger.log("Timer is:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
