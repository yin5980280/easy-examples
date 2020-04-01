package com.vartime.easy.spring.cloud.producer.core.mapper;

import com.vartime.easy.spring.cloud.producer.core.entity.User;

import org.apache.ibatis.annotations.Mapper;

import cn.org.easysite.spring.boot.tk.mybatis.core.mapper.CommonMapper;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-01-29 10:47
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.examples.mapper.UserMapper
 */
@Mapper
public interface UserMapper extends CommonMapper<User> {
}
