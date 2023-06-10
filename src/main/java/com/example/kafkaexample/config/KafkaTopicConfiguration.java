package com.example.kafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    /**
     * Builds a topic with name `sigma`
     *
     * @return
     */
    @Bean
    public NewTopic sigmaTopic() {
        return TopicBuilder.name("sigma").build();
    }


}
