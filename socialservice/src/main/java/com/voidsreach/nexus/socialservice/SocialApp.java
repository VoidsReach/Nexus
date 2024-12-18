package com.voidsreach.nexus.socialservice;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.voidsreach.nexus.socialservice",
        "com.voidsreach.nexus.commons"
})
public class SocialApp {

    public static void main(String[] args) {
        // todo sentry
        SpringApplication.run(SocialApp.class, args);
        LoggerFactory.getLogger(SocialApp.class).info("Nexus Social Service has Started!");
    }

}