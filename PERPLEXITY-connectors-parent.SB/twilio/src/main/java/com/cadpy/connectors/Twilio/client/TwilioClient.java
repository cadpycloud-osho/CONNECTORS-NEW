package com.cadpy.connectors.Twilio.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TwilioClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for twilio connector goes here
}
