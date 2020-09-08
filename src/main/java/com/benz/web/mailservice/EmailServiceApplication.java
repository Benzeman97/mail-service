package com.benz.web.mailservice;

import com.benz.web.mailservice.service.impl.MessageServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmailServiceApplication.class, args);

        MessageServiceImpl messageService=new MessageServiceImpl();
        messageService.generateMessageId();
    }

}
