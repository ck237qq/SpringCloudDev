package com.mike.product;

import com.alibaba.cloud.nacos.discovery.NacosServiceDiscovery;
import com.alibaba.nacos.api.exception.NacosException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.List;

@SpringBootTest
public class DiscoveryTest {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    NacosServiceDiscovery nacosServiceDiscovery;

    @Test
    void nacosServiceDiscoveryTest() throws NacosException {
        for(String service : nacosServiceDiscovery.getServices()){
            System.out.println(service);
            List<ServiceInstance> serviceInstances= nacosServiceDiscovery.getInstances(service);
            for (ServiceInstance instance:serviceInstances){
                System.out.println("ip: " + instance.getHost() + ", port: " + instance.getPort());
            }
            System.out.println("-------------------------------");
        }
    }

    @Test
    public void discoveryTest() {
        System.out.println("執行測試提取目前在線專案");
        for (String service : discoveryClient.getServices()) {
            System.out.println("service: " + service);

            discoveryClient.getInstances(service).forEach(instance -> {
                System.out.println("ip: " + instance.getHost() + ", port: " + instance.getPort());
            });
            System.out.println("-------------------------------");
        }

    }
}
