package com.cadpy.connectors.Stripe.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StripeClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for stripe connector goes here
}
