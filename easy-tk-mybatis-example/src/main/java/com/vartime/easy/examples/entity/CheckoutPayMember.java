package com.vartime.easy.examples.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.org.easysite.commons.base.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支付用户表(CheckoutPayMember)表实体类
 *
 * @author 熊猫大侠
 * @since 2019-04-25 18:09:12
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "checkout_pay_member")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutPayMember extends BaseObject {
    /**
     * 支付用户ID
     **/
    @Column(name = "id")
    private Long id;
    /**
     * 支付用户账号
     **/
    @Column(name = "account")
    private String account;
    /**
     * 注册来源
     **/
    @Column(name = "registration_from")
    private String registrationFrom;
    /**
     * 是否可用 1 可用 0 不可用
     **/
    @Column(name = "status_flag")
    private Integer statusFlag;
    /**
     * 创建时间
     **/
    @Column(name = "server_create_time")
    private Date serverCreateTime;
    /**
     * 更新时间
     **/
    @Column(name = "server_update_time")
    private Date serverUpdateTime;
}
