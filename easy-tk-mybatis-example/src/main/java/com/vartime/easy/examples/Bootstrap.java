package com.vartime.easy.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-01-29 10:40
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.examples.Bootstrap
 */
@SpringBootApplication
@EnableSwagger2
@EnableAsync
public class Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
