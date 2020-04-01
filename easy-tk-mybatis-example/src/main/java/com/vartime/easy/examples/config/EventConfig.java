package com.vartime.easy.examples.config;

import com.vartime.easy.examples.service.impl.Publisher;
import com.vartime.easy.examples.service.impl.RedisListener;
import com.vartime.easy.examples.service.impl.RedisPublisher;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-02-18 17:31
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.examples.config.EventConfig
 */
@Configuration
public class EventConfig {
    @Bean
    @ConditionalOnMissingBean
    RedisListener listener() {
        return new RedisListener();
    }

    @Bean
    MessageListenerAdapter listenerAdapter(RedisListener receiver) {
        return new MessageListenerAdapter(receiver, "listener");
    }

    @Bean
    Publisher publisher() {
        return new RedisPublisher();
    }

    @Bean
    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
            MessageListenerAdapter listenerAdapter) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.addMessageListener(listenerAdapter, new PatternTopic("event-bus-topic-test"));
        return container;
    }
}
