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
public class MediaService {

    public static void main(String[] args) {
        // todo sentry
        SpringApplication.run(MediaService.class, args);
        LoggerFactory.getLogger(MediaService.class).info("Nexus Media Service has Started!");
    }

}