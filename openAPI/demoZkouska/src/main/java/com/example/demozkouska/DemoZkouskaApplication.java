package com.example.demozkouska;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class DemoZkouskaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoZkouskaApplication.class, args);
    }


}
