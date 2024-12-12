package com.voidsreach.nexus.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.voidsreach.nexus.discoveryservice",
        "com.voidsreach.nexus.commons"
})
public class DiscoveryService {
    public static void main(String[] args) {
        // todo sentry
        SpringApplication.run(DiscoveryService.class, args);
        System.out.println("Nexus DiscoveryService has Started!");
    }
}