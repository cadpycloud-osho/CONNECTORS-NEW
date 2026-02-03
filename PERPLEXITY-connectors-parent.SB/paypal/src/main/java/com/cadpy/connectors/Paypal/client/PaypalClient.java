package com.cadpy.connectors.Paypal.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaypalClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for paypal connector goes here
}
