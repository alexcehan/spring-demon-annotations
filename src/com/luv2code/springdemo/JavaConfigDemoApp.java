package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {
        //read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);


        //get the bean from spring container
//        Coach coach = context.getBean("tennisCoach", Coach.class);
//        Coach coach1 = context.getBean("footballCoach", Coach.class);
//


        //call a method to call the daily fortune
//        System.out.println(coach.getDailyWorkout());
//        System.out.println(coach.getDailyFortune());
//        System.out.println(coach1.getDailyFortune());


        //close the context
        context.close();
    }
}
