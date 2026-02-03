package com.cadpy.connectors.Rabbitmq.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RabbitmqClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for rabbitmq connector goes here
}
