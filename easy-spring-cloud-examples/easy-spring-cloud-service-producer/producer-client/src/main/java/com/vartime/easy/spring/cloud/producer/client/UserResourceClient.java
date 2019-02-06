package com.vartime.easy.spring.cloud.producer.client;


import com.vartime.easy.spring.cloud.example.api.UserResourceInterface;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author : yinlin
 * @version : 1.0
 * Description :
 * Copyright : Copyright (c) 2018
 * Company : KeRuYun Technology(Beijing) Chengdu Co. Ltd.
 * @date : 2018/6/15 下午6:00
 * @link : com.keruyun.checkout.client.UserResourceClient
 */
@FeignClient("${producer.server.name}")
public interface UserResourceClient extends UserResourceInterface {
}
