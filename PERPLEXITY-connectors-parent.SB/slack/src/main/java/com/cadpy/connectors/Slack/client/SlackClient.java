package com.cadpy.connectors.Slack.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SlackClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for slack connector goes here
}
