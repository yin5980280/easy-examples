package com.vartime.easy.examples.entity;

import cn.org.easysite.spring.boot.tk.mybatis.core.entity.BaseLogicEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2018/9/26 下午5:39
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : KeRuYun Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.mycloud.sample.entity.User
 */
@Entity
@Table(name = "t_coin")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coin extends BaseLogicEntity {

    @Column(name = "name", length = 32)
    private String name;

    @Column(name = "site")
    private String site;

    private String ip;
}
