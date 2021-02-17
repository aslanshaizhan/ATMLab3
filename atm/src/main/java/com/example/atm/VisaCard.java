package com.example.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

@Component
public class VisaCard {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void getCardById(Long id) {
        jdbcTemplate.query("select * from card", (RowCallbackHandler) new VisaCard());
    }
}
