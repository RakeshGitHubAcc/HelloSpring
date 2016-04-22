package com.tutorialspoint.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchedulerConfig {
	@Bean(name="scheduler")
	public SchedulerBO suchedulerBo() {
		return new SchedulerBO();
	}
}
