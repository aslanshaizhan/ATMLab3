package com.example.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        context1.scan("com.example.atm");
        context1.refresh();

        Bank bank = context.getBean("ATM", Bank.class);
        System.out.println(bank);

        List<Card> cardList = context.getBean("cardList", List.class);
        System.out.println("cardList = " + cardList);
    }
}
