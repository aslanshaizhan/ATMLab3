package com.example.atm;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BankService {
    String dburl;
    String dbuser;
    String dbpassword;

    public BankService(String dburl, String dbuser, String dbpassword) {
        this.dburl = dburl;
        this.dbuser = dbuser;
        this.dbpassword = dbpassword;
    }

    public BankService() {
    }

    @PostConstruct
    public void init(){
        openConnection();
    }

    @PreDestroy
    public void destroy(){
        closeConnection();
    }

    public void openConnection(){
        System.out.println("Open the connection!");
    }

    public void closeConnection(){
        System.out.println("Close the connection");
    }

    public String getDburl() {
        return dburl;
    }

    public String getDbuser() {
        return dbuser;
    }

    public String getDbpassword() {
        return dbpassword;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }

    public void setDbuser(String dbuser) {
        this.dbuser = dbuser;
    }

    public void setDbpassword(String dbpassword) {
        this.dbpassword = dbpassword;
    }
}
