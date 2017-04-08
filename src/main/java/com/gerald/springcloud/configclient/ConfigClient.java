package com.gerald.springcloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClient {
    @Value("${common.name}")
    private String name;
    
    @Value("${default}")
    private Integer defaultValue;
    
    @RequestMapping("/hello")
    public String hello() {
        return name;
    }
    
    @RequestMapping("/default")
    public Integer defaultValue() {
        return defaultValue;
    }
    
    public static void main( String[] args ) {
        SpringApplication.run(ConfigClient.class, args);
    }
}
