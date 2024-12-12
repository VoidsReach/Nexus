package com.voidsreach.nexus.notificationservice;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.voidsreach.nexus.notificationservice",
        "com.voidsreach.nexus.commons"
})
public class NotificationService {

    public static void main(String[] args) {
        // todo sentry
        SpringApplication.run(NotificationService.class, args);
        LoggerFactory.getLogger(NotificationService.class).info("Nexus Notification Service has Started!");
    }

}