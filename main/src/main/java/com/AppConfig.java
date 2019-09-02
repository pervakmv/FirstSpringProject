package com;

import com.lesson2.Order;
import com.lesson2.OrderDAO;
import com.lesson2.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

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
