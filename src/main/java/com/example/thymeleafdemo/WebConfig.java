package com.example.thymeleafdemo;


import com.example.thymeleafdemo.DAO.RaceDAO;
import com.example.thymeleafdemo.DAO.RaceDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


import javax.sql.DataSource;

@Configuration
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public DataSource getDataSource() {


        DriverManagerDataSource dataSource= new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://www.thompsonprojects.com:3306/thompson_challenge?reconnect=true");
        dataSource.setUsername("thompson_dontaedb");
        dataSource.setPassword("Progamer102345678");



        return dataSource;
    }


    @Bean
    public RaceDAO getRaceDAO() { return new RaceDAOImpl(getDataSource());

    }






}