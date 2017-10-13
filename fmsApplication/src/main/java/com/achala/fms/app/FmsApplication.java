package com.achala.fms.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@EntityScan(basePackages = "com.achala.fms.domain")
@ComponentScan(basePackages = {"com.achala.fms.service", "com.achala.fms.app.web"})
@EnableJpaRepositories(basePackages = "com.achala.fms.repository")
@EnableAutoConfiguration
public class FmsApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FmsApplication.class, args);
    }


}
