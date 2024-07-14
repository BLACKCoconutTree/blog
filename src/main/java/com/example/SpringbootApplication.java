package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mapper")
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
