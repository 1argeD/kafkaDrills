package com.example.kafkadrills.Controller;

import com.example.kafkadrills.Service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class kafkaController {
    private final KafkaProducerService producerService;

    @PostMapping("/kafka")
    public String sendMessage(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "success";
    }
}
