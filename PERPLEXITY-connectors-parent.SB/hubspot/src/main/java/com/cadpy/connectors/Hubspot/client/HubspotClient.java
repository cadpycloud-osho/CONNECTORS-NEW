package com.cadpy.connectors.Hubspot.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HubspotClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for hubspot connector goes here
}
