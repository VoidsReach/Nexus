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
public class GatewayService {

    public static void main(String[] args) {
        // todo sentry
        SpringApplication.run(GatewayService.class, args);
        LoggerFactory.getLogger(GatewayService.class).info("Nexus Gateway Service has Started!");
    }

}