package com.mike.order.controller;

import java.math.BigDecimal;
import java.util.List;

import com.mike.order.properties.OrderProperties;
import order.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import product.ProductDto;

@RestController
public class OrderRestController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    OrderProperties orderProperties;
    /**
     * 註冊中心測試
     */
    @GetMapping("/config")
    public void config() {
        System.out.println(orderProperties.getTimeout() +","+ orderProperties.getAutoConfirm());
    }

    @GetMapping("/getOrder")
    public OrderDto getOrder() {
        OrderDto orderDto = new OrderDto();
        orderDto.setId(0L);
        orderDto.setTotalAmount(new BigDecimal("0"));
        orderDto.setUserId(0L);
        orderDto.setNickName("");
        orderDto.setAddress("");
        // 這個方法
        List<ProductDto> productDtos = getProductDtoList();
        orderDto.setProductDtoList(productDtos);
        return orderDto;
    }

    private List<ProductDto> getProductDtoList() {
        String url = "http://seata-product/findProduct";

        return restTemplate.exchange(
                url,
                HttpMethod.GET,
                HttpEntity.EMPTY,
                new ParameterizedTypeReference<List<ProductDto>>() {
                }
        ).getBody();
    }

}
