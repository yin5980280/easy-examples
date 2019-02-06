package com.vartime.easy.spring.cloud.producer.core.resource;

import com.vartime.easy.spring.cloud.example.api.UserResourceInterface;
import com.vartime.easy.spring.cloud.producer.model.User;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : yinlin
 * @version : 1.0
 * Description :
 * Copyright : Copyright (c) 2018
 * Company : KeRuYun Technology(Beijing) Chengdu Co. Ltd.
 * @date : 2018/6/15 下午6:05
 * @link : com.keruyun.checkout.resource.UserResource
 */
@RestController
@Slf4j
public class UserResource implements UserResourceInterface {
    @Override
    public User get(@PathVariable("id") Long id) {
        log.info("id:{}", id);
        try {
            Thread.sleep(new Random().nextInt(3000) + 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new User(id, "PANDA");
    }
}
