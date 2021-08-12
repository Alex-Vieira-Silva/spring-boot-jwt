package com.avanade.dio.jwt;

import com.avanade.dio.jwt.data.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtApplication.class, args);


	}
	@Bean
	public  bCryptPasswordEncoder bCryptPasswordEncoder(){
		return new bCryptPasswordEncoder();
	}

}
