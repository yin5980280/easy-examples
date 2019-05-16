package com.vartime.easy.examples.service.impl;

import com.vartime.easy.examples.entity.CheckoutPayMember;
import com.vartime.easy.examples.service.CheckoutPayMemberService;

import org.springframework.stereotype.Service;

import cn.org.easysite.spring.boot.tk.mybatis.core.service.impl.AbstractBaseServiceImpl;

/**
 * 支付用户表(CheckoutPayMember)表服务实现类
 *
 * @author 熊猫大侠
 * @since 2019-04-25 18:09:12
 */
@Service("checkoutPayMemberService")
public class CheckoutPayMemberServiceImpl extends AbstractBaseServiceImpl<CheckoutPayMember> implements CheckoutPayMemberService {

}
