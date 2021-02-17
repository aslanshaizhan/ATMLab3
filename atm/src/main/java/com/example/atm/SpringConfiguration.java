package com.example.atm;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.example.atm")
@PropertySource("application.properties")
public class SpringConfiguration {

    @Bean
    public List<Card> cardList() {
        List<Card> cardList = new ArrayList<>();
        cardList.add(new Card("Master Card"));
        cardList.add(new Card("Visa"));

        return cardList;
    }

        @Bean
        public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.Driver");
        dataSource.setUrl("");
        dataSource.setUsername("");
        dataSource.setPassword("qwerty");

        return dataSource;
    }

        @Bean
        public JdbcTemplate jdbcTemplate() {
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());

        return jdbcTemplate;
    }
}
