package com.achala.fms.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
public class FmsApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FmsApplication.class, args);
    }


}
