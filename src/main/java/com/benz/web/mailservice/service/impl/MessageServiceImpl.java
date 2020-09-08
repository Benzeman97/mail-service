package com.benz.web.mailservice.service.impl;

import java.util.Random;

public class MessageServiceImpl {

    public void generateMessageId()
    {
        Random random=new Random();

        double r=Math.random();

        System.out.println(r);
    }
}
