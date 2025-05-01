package com.mike.product.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import product.ProductDto;


import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {


    @GetMapping("/findProduct")
    public List<ProductDto> findProduct() {
        List<ProductDto> productDtoList = new ArrayList<>();
        for (long i = 0; i < 10L; i++) {
            ProductDto productDto = new ProductDto();
            productDto.setId(i);
            productDto.setPrice(new BigDecimal("0"));
            productDto.setProductName("");
            productDto.setNum(0);
            productDtoList.add(productDto);
        }

        return productDtoList;
    }
}
