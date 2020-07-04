package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.accp.dao")
public class JavaSpringbootDw3Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringbootDw3Application.class, args);
	}

}
