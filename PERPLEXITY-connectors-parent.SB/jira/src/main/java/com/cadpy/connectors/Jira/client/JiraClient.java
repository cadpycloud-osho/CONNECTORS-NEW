package com.cadpy.connectors.Jira.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JiraClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for jira connector goes here
}
