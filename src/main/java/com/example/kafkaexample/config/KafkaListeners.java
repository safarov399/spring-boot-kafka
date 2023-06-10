package com.example.kafkaexample.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "sigma",
            groupId = "sigmaID"
    )
    void listener(String data) {
        System.out.println("Listener receiver: " + data);
    }
}
