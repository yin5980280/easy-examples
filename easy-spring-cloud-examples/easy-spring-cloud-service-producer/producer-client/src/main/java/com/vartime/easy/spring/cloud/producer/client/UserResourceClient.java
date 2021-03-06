package com.vartime.easy.spring.cloud.producer.client;


import com.vartime.easy.spring.cloud.example.api.UserResourceInterface;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author : yinlin
 * @version : 1.0
 * Description :
 * Copyright : Copyright (c) 2018
 * Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @date : 2018/6/15 下午6:00
 * @link : com.熊猫科技.checkout.client.UserResourceClient
 */
@FeignClient(value = "${producer.server.name}", path = "api")
public interface UserResourceClient extends UserResourceInterface {
}
