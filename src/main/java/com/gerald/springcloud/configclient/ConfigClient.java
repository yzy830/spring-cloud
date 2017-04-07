package com.gerald.springcloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClient 
{
    @Value("${common.name}")
    private String name;
    
    @RequestMapping("/")
    public String hello() {
        return name;
    }
    
    public static void main( String[] args ) {
        SpringApplication.run(ConfigClient.class, args);
    }
}
