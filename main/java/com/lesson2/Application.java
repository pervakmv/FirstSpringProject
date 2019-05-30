package com.lesson2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    Order order(){
        return new Order();
    }

    @Bean
    OrderService orderService(){
        return new OrderService();
    }

    @Bean
    OrderDAO orderDAO(){
        return new OrderDAO();
    }



}

