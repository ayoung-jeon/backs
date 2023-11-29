package com.sparta.backs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BacksApplication {

    public static void main(String[] args) {
        SpringApplication.run(BacksApplication.class, args);
    }

}
