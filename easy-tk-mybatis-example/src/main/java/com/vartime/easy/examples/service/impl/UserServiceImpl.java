package com.vartime.easy.examples.service.impl;

import com.vartime.easy.examples.entity.User;
import com.vartime.easy.examples.mapper.UserMapper;
import com.vartime.easy.examples.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.org.easysite.spring.boot.tk.mybatis.core.repository.impl.AbstractBaseLogicRepositoryImpl;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-01-29 10:54
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.examples.service.impl.UserServiceImpl
 */
@Service
public class UserServiceImpl extends AbstractBaseLogicRepositoryImpl<User> implements UserService {
    @Autowired
    private UserMapper userMapper;
}
