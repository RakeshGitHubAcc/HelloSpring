package com.tutorialspoint.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
	@Bean(name="customer")
	public CustomerBO customerBo() {
		return new CustomerBO();

	}
}
