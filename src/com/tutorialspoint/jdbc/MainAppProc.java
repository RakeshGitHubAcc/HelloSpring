package com.tutorialspoint.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppProc {
	 public static void main(String[] args) {
	      ApplicationContext context = 
	             new ClassPathXmlApplicationContext("JdbcTest.xml");

	      StudentJDBCProcTemplate studentJDBCProcTemplate = 
	      (StudentJDBCProcTemplate)context.getBean("studentJDBCProcTemplate");
	      
	      System.out.println("------Records Creation--------" );
	      studentJDBCProcTemplate.create("Zara", 11);
	      studentJDBCProcTemplate.create("Nuha", 2);
	      studentJDBCProcTemplate.create("Ayan", 15);

	      System.out.println("------Listing Multiple Records--------" );
	      List<Student> students = studentJDBCProcTemplate.listStudents();
	      for (Student record : students) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.println(", Age : " + record.getAge());
	      }

	      System.out.println("----Listing Record with ID = 2 -----" );
	      Student student = studentJDBCProcTemplate.getStudent(2);
	      System.out.print("ID : " + student.getId() );
	      System.out.print(", Name : " + student.getName() );
	      System.out.println(", Age : " + student.getAge());
		  
	   }
}
