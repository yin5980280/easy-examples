package com.vartime.easy.spring.cloud.monitor.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-02-06 23:52
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : KeRuYun Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.spring.cloud.mointor.admin.MointerBootstrap
 */
@EnableAdminServer
@SpringBootApplication
public class MonitorBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(MonitorBootstrap.class, args);
    }
}
