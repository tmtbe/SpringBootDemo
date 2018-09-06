package com.example.consul;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class ConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication.class, args);
    }
}
