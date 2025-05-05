package com.mike.order.feign;


import com.mike.order.feign.fallback.ProductClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import product.ProductDto;

import java.util.List;

@FeignClient(value = "service-product" , fallback = ProductClientFallback.class)
public interface ProductFeignClient {

    @GetMapping("/findProduct")
    List<ProductDto> findProduct();
}
