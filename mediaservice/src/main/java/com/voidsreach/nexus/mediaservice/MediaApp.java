package com.voidsreach.nexus.mediaservice;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.voidsreach.nexus.mediaservice",
        "com.voidsreach.nexus.commons"
})
public class MediaApp {

    public static void main(String[] args) {
        // todo sentry
        SpringApplication.run(MediaApp.class, args);
        LoggerFactory.getLogger(MediaApp.class).info("Nexus Media Service has Started!");
    }

}