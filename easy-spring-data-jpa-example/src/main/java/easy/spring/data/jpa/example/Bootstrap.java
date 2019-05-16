package easy.spring.data.jpa.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import cn.org.easysite.spring.boot.jpa.factory.bean.LogicJpaRepositoryFactoryBean;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-05-16 18:28
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : EasySite Technology Chengdu Co. Ltd.
 * @link : easy.spring.data.jpa.example.Bootstrap
 */
@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = LogicJpaRepositoryFactoryBean.class)
public class Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
