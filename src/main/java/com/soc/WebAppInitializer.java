package com.soc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.soc")
public class WebAppInitializer{

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebAppInitializer.class, args);
    }

}