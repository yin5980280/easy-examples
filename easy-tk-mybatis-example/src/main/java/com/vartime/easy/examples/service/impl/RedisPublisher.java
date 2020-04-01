package com.vartime.easy.examples.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2018/11/14 10:11 AM
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vpay.exchange.core.eventbus.impl.RedisPublisher
 */
public class RedisPublisher implements Publisher {

    @Autowired
    private StringRedisTemplate template;

    @Value("${event.topic:event-bus-topic-test}")
    private String eventTopic;

    @Override
    public void publish(String msg) {
        template.opsForList().leftPush(eventTopic, msg);
       //template.convertAndSend(eventTopic, msg);
    }
}
