package com.uboxol.hubble.gateway.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServerApplication {
    public static void main(String[] args) {
        //禁用nacos默认日志配置
        System.setProperty("nacos.logging.default.config.enabled", "false");
        SpringApplication.run(GatewayServerApplication.class, args);
    }
}
