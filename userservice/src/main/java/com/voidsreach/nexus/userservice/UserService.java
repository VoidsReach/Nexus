package com.voidsreach.nexus.userservice;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.voidsreach.nexus.userservice",
        "com.voidsreach.nexus.commons"
})
public class UserService {

    public static void main(String[] args) {
        // todo sentry
        SpringApplication.run(UserService.class, args);
        LoggerFactory.getLogger(UserService.class).info("Nexus User Service has Started!");
    }

}