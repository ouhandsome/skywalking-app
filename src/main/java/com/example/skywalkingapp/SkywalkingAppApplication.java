package com.example.skywalkingapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan({"com.example.skywalkingapp.mapper"})
public class SkywalkingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkywalkingAppApplication.class, args);
    }

}



