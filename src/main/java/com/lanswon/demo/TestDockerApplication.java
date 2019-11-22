package com.lanswon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.lanswon.demo")
public class TestDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDockerApplication.class, args);
    }

}
