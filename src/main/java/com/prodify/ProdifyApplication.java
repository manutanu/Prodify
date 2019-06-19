package com.prodify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan({"com.prodify"})
@EnableJpaRepositories({"com.prodify.repository","com.prodify.security.repository"})
public class ProdifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdifyApplication.class, args);
	}

//	 public WebMvcConfigurer corsConfigurer() {
//	        return new WebMvcConfigurer() {
//	            @Override
//	            public void addCorsMappings(CorsRegistry registry) {
//	                registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:4200");
//	            }
//	        };
//	    }
}
