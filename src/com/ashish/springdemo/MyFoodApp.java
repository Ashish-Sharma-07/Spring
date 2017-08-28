package com.ashish.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFoodApp {

	public static void main(String[] args) {
		
		//load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the class object
		
		Food f = context.getBean("myFood",Food.class);
		
		System.out.println(f.getFood());
		
		context.close();
		

	}

}
