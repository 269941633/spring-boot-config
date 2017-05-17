package com.fei.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("studentConfig")
@ConfigurationProperties
@PropertySource("classpath:/student.properties")
public class StudentConfig {

	private String name;
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
