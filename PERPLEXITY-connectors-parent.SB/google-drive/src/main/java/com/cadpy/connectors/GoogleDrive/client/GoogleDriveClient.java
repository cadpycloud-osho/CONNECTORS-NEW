package com.cadpy.connectors.GoogleDrive.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoogleDriveClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for google-drive connector goes here
}
