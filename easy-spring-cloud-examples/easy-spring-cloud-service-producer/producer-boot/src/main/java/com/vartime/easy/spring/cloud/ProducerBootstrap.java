package com.vartime.easy.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-02-06 23:13
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.spring.cloud.ProducerBootstrap
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProducerBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ProducerBootstrap.class, args);
    }
}
