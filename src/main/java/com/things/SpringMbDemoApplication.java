package com.things;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.things.model")
public class SpringMbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMbDemoApplication.class, args);
	}
}
