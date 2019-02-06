package com.vartime.easy.spring.cloud.producer.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author : yinlin
 * @version : 1.0
 * Description :
 * Copyright : Copyright (c) 2018
 * Company : KeRuYun Technology(Beijing) Chengdu Co. Ltd.
 * @date : 2018/6/15 下午6:03
 * @link : com.keruyun.checkout.configuration.FeignConfiguration
 */
@Configuration
@EnableFeignClients("com.vartime.easy.spring.cloud.producer.client.api")
public class FeignConfiguration {
}
