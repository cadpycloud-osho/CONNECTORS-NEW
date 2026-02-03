package com.cadpy.connectors.Mysql.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MysqlClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for mysql connector goes here
}
