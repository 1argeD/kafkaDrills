package com.example.kafkadrills.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {
    private static final String TOPIC = "1argeD";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void  sendMessage(String message) {
        System.out.println("produce message = "+ message);
        kafkaTemplate.send(TOPIC, message);
    }
}
