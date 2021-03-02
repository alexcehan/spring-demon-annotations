package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        //read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        //get the bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);



        //call a method to call the daily fortune
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());


        //close the context
        context.close();
    }
}
