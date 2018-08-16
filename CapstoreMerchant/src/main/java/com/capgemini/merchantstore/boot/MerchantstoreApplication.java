package com.capgemini.merchantstore.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages= {"com.capgemini.merchantstore"})
@EntityScan(basePackages="com.capgemini.merchantstore.beans")
@EnableJpaRepositories(basePackages="com.capgemini.merchantstore.repo")
@EnableWebMvc
public class MerchantstoreApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(MerchantstoreApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MerchantstoreApplication.class);
	}
	
}
