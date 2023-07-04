package com.goesbernardo.watherapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WatherApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatherApiApplication.class, args);
    }

}
