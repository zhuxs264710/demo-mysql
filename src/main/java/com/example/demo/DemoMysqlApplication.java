package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.mapper") 
@EntityScan(basePackages = "com.example.demo.entity")
public class DemoMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMysqlApplication.class, args);
	}

}
