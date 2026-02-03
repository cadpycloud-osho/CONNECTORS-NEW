package com.cadpy.connectors.Shopify.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShopifyClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for shopify connector goes here
}
