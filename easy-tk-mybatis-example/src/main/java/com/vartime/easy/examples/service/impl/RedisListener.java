package com.vartime.easy.examples.service.impl;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2018/11/14 10:15 AM
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vpay.exchange.core.eventbus.impl.RedisLinstener
 */

@Slf4j
public class RedisListener {

    public void listener(String msg) {
        log.info("获取到远程事件消息为:{}", msg);
    }
}
