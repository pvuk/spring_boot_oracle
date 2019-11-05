package com.spring.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author venkataudaykiranp
 * 
 *
 */
@SpringBootApplication
@ComponentScan({"com.spring.oracle.controller"})
@EntityScan("com.spring.oracle.entity")
@EnableJpaRepositories("com.spring.oracle.repo")
public class SpringBootOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOracleApplication.class, args);
	}
}
