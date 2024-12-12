package com.voidsreach.nexus.socialservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.voidsreach.nexus.userservice",
        "com.voidsreach.nexus.commons"
})
public class SocialService {

    public static void main(String[] args) {
        // todo sentry
        SpringApplication.run(SocialService.class, args);
        System.out.println("Nexus SocialService has Started!");
    }

}