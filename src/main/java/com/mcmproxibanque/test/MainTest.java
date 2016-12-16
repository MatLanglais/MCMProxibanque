package com.mcmproxibanque.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mcmproxibanque.model.Customer;

public class MainTest {

	public static void main(String[] args) {
//		Customer c = new Customer();
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
//		System.out.println(c);

	}
	
	

}
