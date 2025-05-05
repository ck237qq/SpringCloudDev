package com.mike.order.feign.fallback;

import com.mike.order.feign.ProductFeignClient;
import org.springframework.stereotype.Component;
import product.ProductDto;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductClientFallback implements ProductFeignClient {

    /**
     * 例外時回傳的物件
     */
    @Override
    public List<ProductDto> findProduct() {
        System.out.println("執行兜底回調");
        return new ArrayList<>();
    }
}
