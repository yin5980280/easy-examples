package com.vartime.easy.examples.service;

import com.vartime.easy.examples.entity.Coin;

import cn.org.easysite.spring.boot.tk.mybatis.core.service.BaseLogicService;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-01-29 10:47
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.examples.service.UserService
 */
public interface CoinService extends BaseLogicService<Coin> {
    void processor();
}
