package com.vartime.easy.spring.cloud.example.api;

import com.vartime.easy.spring.cloud.producer.model.UserVO;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.org.easysite.spring.boot.model.BasePageQuery;
import cn.org.easysite.spring.boot.model.PageInfo;

/**
 * @author : yinlin
 * @version : 1.0
 * Description :
 * Copyright : Copyright (c) 2018
 * Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @date : 2018/6/15 下午5:55
 * @link : com.熊猫科技.checkout.api.UserResourceInterface
 */
public interface UserResourceInterface {

    @RequestMapping(value = "user/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    UserVO get(@PathVariable("id") Long id);

    @RequestMapping(value = "users",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    PageInfo<UserVO> list(@RequestBody BasePageQuery query);
}
