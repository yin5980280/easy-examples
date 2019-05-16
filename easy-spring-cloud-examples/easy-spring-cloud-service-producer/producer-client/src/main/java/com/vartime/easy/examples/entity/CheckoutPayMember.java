package com.vartime.easy.examples.entity;

import java.util.Date;
import cn.org.easysite.spring.boot.tk.mybatis.core.entity.BaseLogicEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支付用户表(CheckoutPayMember)表实体类
 *
 * @author makejava
 * @since 2019-04-25 14:23:42
 */
@SuppressWarnings("serial")
@Entity(name = "checkout_pay_member")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutPayMember extends BaseLogicEntity {
    支付用户账号
            /**
         * 支付用户账号
         **/
        private String account;
    注册来源
            /**
         * 注册来源
         **/
        private String registrationFrom;
    是否可用 1 可用 0 不可用
            /**
         * 是否可用 1 可用 0 不可用
         **/
        private Integer statusFlag;
}