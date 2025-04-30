package com.mike.order.controller;
import java.math.BigDecimal;

import order.OrderDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {

    @GetMapping("/create")
    public OrderDto create(){
        OrderDto orderDto =  new OrderDto();
        orderDto.setId(0L);
        orderDto.setTotalAmount(new BigDecimal("0"));
        orderDto.setUserId(0L);
        orderDto.setNickName("");
        orderDto.setAddress("");


        return orderDto;
    }

}
