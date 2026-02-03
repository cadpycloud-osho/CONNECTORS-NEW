package com.cadpy.connectors.ServiceNow.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceNowClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for service-now connector goes here
}
