package com.mike.order.config;


import feign.Retryer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OrderConfig {

    @LoadBalanced // 負載平衡標籤
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /***
     * 斷線重連機制 預設 間隔100豪秒 最大間隔1秒 最多嘗試5次
     */
    @Bean
    Retryer retryer() {
        return new Retryer.Default();
    }
}
