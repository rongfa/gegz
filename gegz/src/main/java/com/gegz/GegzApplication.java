package com.gegz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gegz.dao")
public class GegzApplication {

	public static void main(String[] args) {
		SpringApplication.run(GegzApplication.class, args);
	}
}
