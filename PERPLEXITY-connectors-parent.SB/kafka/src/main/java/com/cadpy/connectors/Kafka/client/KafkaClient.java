package com.cadpy.connectors.Kafka.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class KafkaClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for kafka connector goes here
}
