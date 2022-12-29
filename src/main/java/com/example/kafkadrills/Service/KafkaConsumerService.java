package com.example.kafkadrills.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "1argeD", groupId="namu")
    public void consume(String message) throws IOException {
        System.out.println("consume message"+ message);
    }
}
