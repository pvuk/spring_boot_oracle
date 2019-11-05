package com.spring.oracle.config;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Configuration
@ConfigurationProperties(prefix = "oracle")
public class DataSourceProperties {
	@NotNull private String driverClassName;
	@NotNull private String url;
	@NotNull private String username;
	@NotNull private String password;
//	private int maximumPoolSize = 10;
//	private int minimumIdle = 0;
	
	// TODO Add other Hikari data source settings here as required.
	// See https://github.com/brettwooldridge/HikariCP/blob/dev/src/main/java/com/zaxxer/hikari/HikariConfig.java
}
