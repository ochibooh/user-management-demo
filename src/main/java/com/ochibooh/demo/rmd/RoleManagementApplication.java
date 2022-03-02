package com.ochibooh.demo.rmd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class RoleManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(RoleManagementApplication.class, args);
    }
}
