package com.example;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Slf4j
@EnableFeignClients
@SpringBootApplication
public class CustomerMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerMainApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(NacosConfigManager nacosConfigManager) {
        return args -> {
            ConfigService configService = nacosConfigManager.getConfigService();


            configService.addListener("service-customer.properties", "DEFAULT_GROUP", new Listener() {
                @Override
                public Executor getExecutor() {
                    return Executors.newFixedThreadPool(4);
                }

                @Override
                public void receiveConfigInfo(String s) {
                    log.info("[系統] nacosConfig修改:");
                    System.out.println(s);
                    // 未來預留接e-mail給管理員的地方

                }
            });

            log.info("[系統] nacosConfigManager監聽service-customer.properties的DEFAULT_GROUP啟動");
        };
    }
}
