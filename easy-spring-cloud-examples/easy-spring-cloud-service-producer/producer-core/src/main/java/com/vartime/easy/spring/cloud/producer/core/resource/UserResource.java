package com.vartime.easy.spring.cloud.producer.core.resource;

import com.github.pagehelper.Page;
import com.vartime.easy.commons.base.bean.BeanConverter;
import com.vartime.easy.spring.boot.model.BaseQuery;
import com.vartime.easy.spring.boot.model.PageInfo;
import com.vartime.easy.spring.cloud.example.api.UserResourceInterface;
import com.vartime.easy.spring.cloud.producer.core.entity.User;
import com.vartime.easy.spring.cloud.producer.core.service.UserService;
import com.vartime.easy.spring.cloud.producer.model.UserVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("api")
public class UserResource implements UserResourceInterface {

    @Autowired
    private UserService userService;

    @Override
    public UserVO get(@PathVariable("id") Long id) {
        log.info("id:{}", id);
        try {
            Thread.sleep(new Random().nextInt(3000) + 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userService.selectByPk(id).convert(UserVO.class);
    }

    @Override
    public PageInfo<UserVO> list(BaseQuery baseQuery) {
        baseQuery.pageStart();
        Page<User> users = (Page<User>) userService.selectAll();
        PageInfo<UserVO> info = PageInfo.valueOf(users);
        info.setList(BeanConverter.convert(UserVO.class, users));
        return info;
    }
}
