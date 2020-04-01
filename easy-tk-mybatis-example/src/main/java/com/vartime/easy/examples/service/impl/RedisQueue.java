package com.vartime.easy.examples.service.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-02-18 18:04
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.examples.service.impl.RedisQueue
 */
@Component
public class RedisQueue implements InitializingBean, DisposableBean {

    @Value("${event.topic:event-bus-topic-test}")
    private String eventTopic;

    @Autowired
    private StringRedisTemplate template;

    @Autowired
    private RedisListener listener;

    private Thread listenerThread;

    private boolean isClosed;

    private boolean start;

    @Override
    public void destroy() throws Exception {
        if(isClosed){
            return;
        }
        shutdown();

    }

    private void shutdown() {
        try {
            listenerThread.interrupt();
        }catch(Exception e){
            //
        }
    }

    @Override
    public void afterPropertiesSet() {
        if (!start && listenerThread == null) {
            listenerThread = new ListenerThread();
            listenerThread.setDaemon(true);
            listenerThread.start();
            start = true;
        }
    }

    class ListenerThread extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    String value = template.opsForList().rightPop(eventTopic);
                    //逐个执行
                    if (value != null) {
                        try {
                            listener.listener(value);
                        } catch(Exception e) {
                            //
                        }
                    }
                    Thread.sleep(1);
                } catch(Exception e) {
                    //
                }
            }
        }
    }

}
