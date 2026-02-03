package com.cadpy.connectors.Mongodb.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MongodbClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for mongodb connector goes here
}
