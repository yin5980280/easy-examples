package easy.spring.data.jpa.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import cn.org.easysite.spring.boot.jpa.factory.bean.LogicJpaRepositoryFactoryBean;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-05-17 15:58
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : EasySite Technology Chengdu Co. Ltd.
 * @link : easy.spring.data.jpa.example.FactoryConfig
 */
@Configuration
@EnableJpaRepositories(repositoryFactoryBeanClass = LogicJpaRepositoryFactoryBean.class)
public class FactoryConfig {
}
