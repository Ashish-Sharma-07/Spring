package com.ashish.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFoodApp {

	public static void main(String[] args) {
		
		//load the configuration file
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the class object
		Food f1 = context1.getBean("mySouthFood",Food.class);
		System.out.println(f1.getDrinks());
		System.out.println(f1.getFood());
		
		context1.close();
	}

}
