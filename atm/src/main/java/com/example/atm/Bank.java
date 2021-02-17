package com.example.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bank {

    @Value("${bank.name}")
    private String username;
    private String message;
    @Autowired
    private Card card;

    public Bank() {}

    @Autowired
    public Bank(Card card){
        this.card = card;
        System.out.println("Bank.Bank constructor");
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Autowired
    @Qualifier ("visa")
    public void setCard(Card card){
        this.card = card;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void changePin() {
        System.out.println("Your pin code is:" + card.getPin());
    }

    @Override
    public String toString() {
        return "Bank {" +
            "username = " + username + '\'' +
                    ", card = " + card +
                    ", message {" + message + "}" +
                    '}';

        }
}
