package com.mike.order.controller;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import order.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import product.ProductDto;

@RestController
public class OrderRestController {

    private final RestTemplate restTemplate = new RestTemplate();

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
            String url = "http://" + "127.0.0.1" + ":" + instance.getPort() + "/findProduct";
            System.out.println(url);

            List<ProductDto> a = restTemplate.exchange(
                    url,
                    HttpMethod.GET,
                    HttpEntity.EMPTY,
                    new ParameterizedTypeReference<List<ProductDto>>() {}
            ).getBody();
            System.out.println(a);
        }
        return  productDtoList;
    }

}
