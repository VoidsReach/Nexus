package com.voidsreach.nexus.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.voidsreach.nexus.userservice",
        "com.voidsreach.nexus.commons"
})
public class GatewayService {

    public static void main(String[] args) {
        // todo sentry
        SpringApplication.run(GatewayService.class, args);
        System.out.println("Nexus UserService has Started!");
    }

}