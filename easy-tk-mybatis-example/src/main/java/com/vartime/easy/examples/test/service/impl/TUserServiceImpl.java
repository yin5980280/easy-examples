package com.vartime.easy.examples.test.service.impl;

import cn.org.easysite.spring.boot.tk.mybatis.core.service.impl.AbstractBaseLogicService;
import com.vartime.easy.examples.test.entity.TUser;
import com.vartime.easy.examples.test.service.TUserService;
import org.springframework.stereotype.Service;

/**
 * (TUser)表服务实现类
 *
 * @author 熊猫大侠
 * @since 2019-05-05 17:59:59
 */
@Service("tUserService")
public class TUserServiceImpl extends AbstractBaseLogicService<TUser> implements TUserService {

}