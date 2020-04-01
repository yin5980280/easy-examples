package com.vartime.easy.examples.test.entity;

import java.util.Date;
import cn.org.easysite.spring.boot.tk.mybatis.core.entity.BaseLogicEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (User)表实体类
 *
 * @author panda
 * @since 2019-06-14 18:00:56
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "t_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseLogicEntity {
    /** 
     * 用户年龄
     **/
    @Column(name = "user_age")
    private Long userAge;
    /** 
     * 用户名
     **/
    @Column(name = "user_name")
    private String userName;
        @Column(name = "usable")
    private Boolean usable;
}