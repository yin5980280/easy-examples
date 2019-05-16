package com.vartime.easy.examples.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.org.easysite.spring.boot.tk.mybatis.core.entity.BaseLogicEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (User)表实体类
 *
 * @author 熊猫大侠
 * @since 2019-05-05 18:00:01
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "t_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseLogicEntity {
        @Column(name = "user_age")
    private Long userAge;
        @Column(name = "user_name")
    private String userName;
}
