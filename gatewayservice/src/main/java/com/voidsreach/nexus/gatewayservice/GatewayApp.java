package com.voidsreach.nexus.gatewayservice;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.voidsreach.nexus.gatewayservice",
        "com.voidsreach.nexus.commons"
})
public class GatewayApp {

    public static void main(String[] args) {
        // todo sentry
        SpringApplication.run(GatewayApp.class, args);
        LoggerFactory.getLogger(GatewayApp.class).info("Nexus Gateway Service has Started!");
    }

}