package com.lesson2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {

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
