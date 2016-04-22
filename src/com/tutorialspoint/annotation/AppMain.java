package com.tutorialspoint.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		CustomerBO customer = (CustomerBO) context.getBean("customer");
		customer.printMsg("Hello 1");

		SchedulerBO scheduler = (SchedulerBO) context.getBean("scheduler");
		scheduler.printMsg("Hello 2");
	}
}
