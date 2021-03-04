package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService) {
//        fortuneService = theFortuneService;
//    }

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;




    //define a default contructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor!");


    }

    //define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">>TennisCoach: Inside doMyStartUpStuff");
    }

    //define destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">>TennisCoach: inside doCleanupStuff()");
    }



    //define a setter method
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//        System.out.println(">> TenisCoach: inside doSomeCrazyStuff() method!");
//    }



    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
