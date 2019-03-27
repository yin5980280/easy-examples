package com.vartime.easy.examples.entity;

import com.easy.site.spring.boot.tk.mybatis.core.entity.BaseLogicEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
@Table(name = "t_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseLogicEntity {

    @Column(name = "user_name", length = 32)
    @NotEmpty(message = "用户名不能为空")
    private String name;

    @Column(name = "user_age")
    @NotNull(message = "年龄不能为空")
    private Long age;
}
