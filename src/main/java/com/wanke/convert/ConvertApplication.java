package com.wanke.convert;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wanke.convert.dao")
@SpringBootApplication
public class ConvertApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvertApplication.class, args);
	}

}
