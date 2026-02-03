package com.cadpy.connectors.Dynamodb.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DynamodbClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for dynamodb connector goes here
}
