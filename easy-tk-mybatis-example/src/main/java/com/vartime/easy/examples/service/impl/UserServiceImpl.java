package com.vartime.easy.examples.service.impl;

import cn.org.easysite.spring.boot.tk.mybatis.core.service.impl.AbstractBaseLogicServiceImpl;
import com.vartime.easy.examples.entity.User;
import com.vartime.easy.examples.mapper.UserMapper;
import com.vartime.easy.examples.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-01-29 10:54
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : KeRuYun Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.examples.service.impl.UserServiceImpl
 */
@Service
public class UserServiceImpl extends AbstractBaseLogicServiceImpl<User> implements UserService {
    @Autowired
    private UserMapper userMapper;
}
