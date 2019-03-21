package com.vartime.easy.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-03-20 20:36
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : EasySite Technology Chengdu Co. Ltd.
 * @link : com.vartime.easy.websocket.WebSocketBootstrap
 */
@EnableScheduling
@SpringBootApplication
public class WebSocketBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(WebSocketBootstrap.class, args);
    }
}
