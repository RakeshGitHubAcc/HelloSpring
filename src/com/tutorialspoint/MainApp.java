package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tutorialspoint.annotation.A;
import com.tutorialspoint.annotation.B;
import com.tutorialspoint.annotation.ConfigB;
import com.tutorialspoint.annotation.HelloWorldConfig;
import com.tutorialspoint.annotation.TextEditorConfig;

public class MainApp {
	public static void main(String[] args) {
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"HelloWorld.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.setMessage("I'm object A");
		objA.getMessage();
		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		objB.getMessage();
		// for bean with prototype scope registerShutdownHook() will not work
		//((AbstractApplicationContext) context).registerShutdownHook();
		
		HelloWorldMsg objWorldMsg = (HelloWorldMsg) context.getBean("helloWorldMsg");
		objWorldMsg.getMessage1();
		objWorldMsg.getMessage2();

		HelloIndiaMsg objIndiaMsg = (HelloIndiaMsg) context.getBean("helloIndiaMsg");
		objIndiaMsg.getMessage1();
		objIndiaMsg.getMessage2();
		objIndiaMsg.getMessage3();
		
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
		JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
		  jc.getAddressList();
		  jc.getAddressSet();
		  jc.getAddressMap();
		  jc.getAddressProp();
		  */
		/*To Run below code to test annotation we need spring-aop*/
		//for a single configuration class
		/*ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

		   helloWorld.setMessage("Hello Annotation World!");
		   helloWorld.getMessage();
		//for multiple configuration file
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(HelloWorldConfig.class);
		//ctx.register(AdditionalConfig.class);
		ctx.refresh();
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello Annotation World for multiple configuration class");
		helloWorld.getMessage();
		
		//injecting bean dependencies
		ApplicationContext ctx = 
			      new AnnotationConfigApplicationContext(TextEditorConfig.class);
			      TextEditor te = ctx.getBean(TextEditor.class);
			      te.spellCheck();
			      */
		//Import Annotation for loading bean configuration
		ApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(ConfigB.class);
		 // now both beans A and B will be available...
		   A a = ctx.getBean(A.class);
		   B b = ctx.getBean(B.class);
	}

}
