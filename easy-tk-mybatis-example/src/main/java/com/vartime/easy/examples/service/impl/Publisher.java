package com.vartime.easy.examples.service.impl;


/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2018/10/15 下午1:50
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.熊猫科技.commons.test.event.impl.Publisher
 */
public interface Publisher {

    /**
     * send event
     * @param msg
     */
    void publish(String msg);
}
