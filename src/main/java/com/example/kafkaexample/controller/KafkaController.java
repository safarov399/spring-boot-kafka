package com.example.kafkaexample.controller;

import com.example.kafkaexample.config.model.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/kafka/{data}")
    public void sendMessage(@PathVariable("data") String data) {
        kafkaTemplate.send("sigma", data);
    }

    @PostMapping("/kafka")
    public void publish(@RequestBody ChatMessage chatMessage) {
        kafkaTemplate.send("sigma", chatMessage.getContent());
    }

}
