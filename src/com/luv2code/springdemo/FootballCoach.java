package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your freekick 400 times!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
