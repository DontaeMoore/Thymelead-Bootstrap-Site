package com.example.thymeleafdemo;

import com.example.thymeleafdemo.DAO.RaceDAOImpl;
import com.example.thymeleafdemo.Model.Cat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThymeleafDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {




		System.out.println("localhost:8080");
		SpringApplication.run(ThymeleafDemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ThymeleafDemoApplication.class);
	}

}
