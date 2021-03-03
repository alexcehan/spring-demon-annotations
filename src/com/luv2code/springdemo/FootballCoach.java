package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    private FortuneService fortuneService;

    public FootballCoach(@Qualifier("databaseFortuneService") FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your freekick 400 times!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
