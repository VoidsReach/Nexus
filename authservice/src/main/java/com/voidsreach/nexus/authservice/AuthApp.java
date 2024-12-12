package com.voidsreach.nexus.authservice;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.voidsreach.nexus.authservice",
        "com.voidsreach.nexus.commons"
})
public class AuthApp {

    public static void main(String[] args) {
        //todo sentry
        SpringApplication.run(AuthApp.class, args);
        LoggerFactory.getLogger(AuthApp.class).info("Nexus Auth Service has Started!");
    }

}