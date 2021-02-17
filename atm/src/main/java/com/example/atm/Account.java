package com.example.atm;

public class Account {

    private String username;
    private String password;
    private int balance;

    public Account(String username, String password, int balance){
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account user: " + username + "and balance amount is: " + balance;
    }
}
