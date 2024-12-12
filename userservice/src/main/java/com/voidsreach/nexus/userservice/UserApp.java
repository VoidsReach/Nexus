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
public class UserApp {

    public static void main(String[] args) {
        // todo sentry
        SpringApplication.run(UserApp.class, args);
        LoggerFactory.getLogger(UserApp.class).info("Nexus User Service has Started!");
    }

}