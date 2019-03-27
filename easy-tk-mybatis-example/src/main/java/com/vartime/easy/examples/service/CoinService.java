package com.vartime.easy.examples.service;

import com.easy.site.spring.boot.tk.mybatis.core.service.BaseLogicService;
import com.vartime.easy.examples.entity.Coin;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-01-29 10:47
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : KeRuYun Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.examples.service.UserService
 */
public interface CoinService extends BaseLogicService<Coin> {
    void processor();
}
