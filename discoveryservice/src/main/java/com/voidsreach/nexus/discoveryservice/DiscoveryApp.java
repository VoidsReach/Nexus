package com.voidsreach.nexus.discoveryservice;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.voidsreach.nexus.discoveryservice",
        "com.voidsreach.nexus.commons"
})
public class DiscoveryApp {
    public static void main(String[] args) {
        // todo sentry
        SpringApplication.run(DiscoveryApp.class, args);
        LoggerFactory.getLogger(DiscoveryApp.class).info("Nexus Discovery Service has Started!");
    }
}