package com.vartime.easy.spring.cloud.resource;
import com.vartime.easy.spring.cloud.producer.client.UserResourceClient;
import com.vartime.easy.spring.cloud.producer.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : yinlin
 * @version : 1.0
 * Description :
 * Copyright : Copyright (c) 2018
 * Company : KeRuYun Technology(Beijing) Chengdu Co. Ltd.
 * @date : 2018/6/15 下午6:08
 * @link : com.keruyun.checkout.resource.UserConsumerResource
 */
@RestController
@Slf4j
public class UserConsumerResource {

    @Autowired
    private UserResourceClient userResourceClient;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") Long id) {
        long startTime = System.currentTimeMillis();
        log.info("调用开始时间{}ms", startTime);
        User user = userResourceClient.get(id);
        long endTime = System.currentTimeMillis();
        log.info("调用结束时间{}ms, 一共花费{}ms", endTime, endTime - startTime);
        return user;
    }
}