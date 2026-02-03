package com.cadpy.connectors.Dropbox.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DropboxClient {
    private final RestTemplate restTemplate = new RestTemplate();
    // Logic for dropbox connector goes here
}
