package com.cadpy.connectors.Elasticsearch.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ElasticsearchClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for elasticsearch connector goes here
}
