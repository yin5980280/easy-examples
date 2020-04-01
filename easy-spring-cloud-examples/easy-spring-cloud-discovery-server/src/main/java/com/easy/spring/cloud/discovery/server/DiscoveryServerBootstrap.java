package com.easy.spring.cloud.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-02-06 22:38
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.easy.spring.cloud.discovery.server.Bootstrap
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerBootstrap.class, args);
    }
}
