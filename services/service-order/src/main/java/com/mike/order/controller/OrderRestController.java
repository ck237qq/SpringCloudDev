package com.mike.order.controller;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import order.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import product.ProductDto;

@RestController
public class OrderRestController {


    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getOrder")
    public OrderDto getOrder(){
        OrderDto orderDto =  new OrderDto();
        orderDto.setId(0L);
        orderDto.setTotalAmount(new BigDecimal("0"));
        orderDto.setUserId(0L);
        orderDto.setNickName("");
        orderDto.setAddress("");
        // 這個方法
        List<ProductDto>productDtos = getProductDtoList();
        orderDto.setProductDtoList(productDtos);
        return orderDto;
    }

    private List<ProductDto> getProductDtoList(){
        List<ProductDto> productDtoList = new ArrayList<>();
        List<ServiceInstance>instances = discoveryClient.getInstances("seata-product");
        if (!instances.isEmpty()) {
            ServiceInstance instance = instances.get(0);
            String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/getProduct";
            System.out.println(url);
        }
        return  productDtoList;
    }

}
