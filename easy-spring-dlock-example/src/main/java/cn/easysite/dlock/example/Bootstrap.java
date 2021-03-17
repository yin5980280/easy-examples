/*
 *  @Copyright : Copyright (c) 2021
 *  @Company : EasySite Technology 阿富汗 Co. Ltd.
 */
package cn.easysite.dlock.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author : 潘多拉
 * @version : 1.0
 * @date : 2021/3/17 11:10 上午
 * @link : cn.easysite.dlock.example.Bootstrap
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
