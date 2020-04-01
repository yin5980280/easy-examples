package com.vartime.easy.spring.cloud.producer.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author : yinlin
 * @version : 1.0
 * Description :
 * Copyright : Copyright (c) 2018
 * Company : 熊猫科技 Technology(Beijing) Chengdu Co. Ltd.
 * @date : 2018/6/15 下午6:03
 * @link : com.熊猫科技.checkout.configuration.FeignConfiguration
 */
@Configuration
@EnableFeignClients("com.vartime.easy.spring.cloud.producer.client")
public class FeignConfiguration {
}
