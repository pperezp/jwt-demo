package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
@ComponentScan("com.example.demo.*")
public class DemoApplication {
// https://blog.softtek.com/es/autenticando-apis-con-spring-y-jwt
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
