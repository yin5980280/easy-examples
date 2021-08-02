package com.vartime.easy.spring.cloud.producer.core.resource;

import com.github.pagehelper.Page;
import com.vartime.easy.spring.cloud.example.api.UserResourceInterface;
import com.vartime.easy.spring.cloud.producer.core.entity.User;
import com.vartime.easy.spring.cloud.producer.core.service.UserService;
import com.vartime.easy.spring.cloud.producer.model.UserVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import cn.org.easysite.commons.base.bean.BeanConverter;
import cn.org.easysite.spring.boot.model.BasePageQuery;
import cn.org.easysite.spring.boot.model.PageInfo;
import cn.org.easysite.spring.boot.tk.mybatis.core.model.BasePageQueryModel;
import cn.org.easysite.spring.boot.tk.mybatis.core.model.PageInfoModel;
import lombok.extern.slf4j.Slf4j;

/**
 * @author : yinlin
 * @version : 1.0
 * Description :
 * Copyright : Copyright (c) 2018
 * Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @date : 2018/6/15 下午6:05
 * @link : com.熊猫科技.checkout.resource.UserResource
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
    public PageInfo<UserVO> list(BasePageQuery baseQuery) {
        BasePageQueryModel basePageQueryModel = baseQuery.convert(BasePageQueryModel.class);
        basePageQueryModel.pageStart();
        Page<User> users = (Page<User>) userService.selectAll();
        PageInfo<UserVO> info = PageInfoModel.valueOf(users).convert(PageInfo.class);
        info.setList(BeanConverter.convert(UserVO.class, users));
        return info;
    }
}
