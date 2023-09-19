package com.example.jenkinsgradleimpl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class JenkinsGradleImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsGradleImplApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hey everyone I am using Jenkins and Gradle!");
            }
        };
    }
}