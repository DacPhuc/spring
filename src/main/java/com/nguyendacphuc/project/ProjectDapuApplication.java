package com.nguyendacphuc.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProjectDapuApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectDapuApplication.class, args);
    }
}
