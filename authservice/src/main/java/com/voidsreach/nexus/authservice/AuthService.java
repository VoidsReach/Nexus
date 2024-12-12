package com.voidsreach.nexus.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.voidsreach.nexus.authservice",
        "com.voidsreach.nexus.commons"
})
public class AuthService {

    public static void main(String[] args) {
        //todo sentry
        SpringApplication.run(AuthService.class, args);
        System.out.println("Nexus AuthService has Started!");
    }

}