package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DatabaseFortuneService implements FortuneService{

    private String[] data = {
            "Beware of the wolf in sheep's clothing. Database!",
            "Diligence is the mother of good luck. Database!",
            "The journey is the reward. Database!"
    };


    //create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);

        return data[index];
    }
}
