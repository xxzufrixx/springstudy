package com.zufri.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load spring config
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationCOntext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call our method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
