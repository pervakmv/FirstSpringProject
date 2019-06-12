package com.lesson2;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class OrderController {

   @Autowired /* зависимость с контейнера достать и использовать*/
    private OrderService orderService; /*Зависимость или Dependencie*/

    public Order save(Order order){
        return orderService.save(order);
    }


    @RequestMapping(method = RequestMethod.GET, value="/test", produces = "text/plain")
    public @ResponseBody
    String test2(){
        System.out.println("Test 2");
        return "Test2";
    }

    @RequestMapping(method = RequestMethod.GET, value="/orderSave", produces = "text/plain")
    public @ResponseBody
    String test(){

        orderService.save(null);

        return "ok";
    }
}
