package com.cadpy.connectors.AzureBlob.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AzureBlobClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for azure-blob connector goes here
}
