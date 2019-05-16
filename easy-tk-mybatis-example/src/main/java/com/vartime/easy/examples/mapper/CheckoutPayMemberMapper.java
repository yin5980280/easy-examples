package com.vartime.easy.examples.mapper;

import com.vartime.easy.examples.entity.CheckoutPayMember;

import org.apache.ibatis.annotations.Mapper;

import cn.org.easysite.spring.boot.tk.mybatis.core.mapper.CommonMapper;

/**
 * 支付用户表(CheckoutPayMember)表数据库访问层
 *
 * @author 熊猫大侠
 * @since 2019-04-25 18:09:12
 */
@Mapper
public interface CheckoutPayMemberMapper extends CommonMapper<CheckoutPayMember> {

}
