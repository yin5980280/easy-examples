package com.vartime.easy.examples.vo;

import java.util.Date;

import cn.org.easysite.commons.base.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支付用户表(CheckoutPayMember)表实体View类
 *
 * @author 熊猫大侠
 * @since 2019-04-25 18:09:12
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("支付用户表")
public class CheckoutPayMemberVO extends BaseObject {
    /**
     * 支付用户ID
     **/
    @ApiModelProperty("支付用户ID")
    private Long id;
    /**
     * 支付用户账号
     **/
    @ApiModelProperty("支付用户账号")
    private String account;
    /**
     * 注册来源
     **/
    @ApiModelProperty("注册来源")
    private String registrationFrom;
    /**
     * 是否可用 1 可用 0 不可用
     **/
    @ApiModelProperty("是否可用 1 可用 0 不可用")
    private Integer statusFlag;
    /**
     * 创建时间
     **/
    @ApiModelProperty("创建时间")
    private Date serverCreateTime;
    /**
     * 更新时间
     **/
    @ApiModelProperty("更新时间")
    private Date serverUpdateTime;
}
