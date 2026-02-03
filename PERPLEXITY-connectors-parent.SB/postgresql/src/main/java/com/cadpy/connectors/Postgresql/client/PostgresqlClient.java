package com.cadpy.connectors.Postgresql.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostgresqlClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for postgresql connector goes here
}
