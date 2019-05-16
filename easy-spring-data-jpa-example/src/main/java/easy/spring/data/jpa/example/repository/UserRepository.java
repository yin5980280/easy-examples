package easy.spring.data.jpa.example.repository;

import cn.org.easysite.spring.boot.jpa.repository.LogicJpaRepository;
import easy.spring.data.jpa.example.entity.User;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-05-16 18:34
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : EasySite Technology Chengdu Co. Ltd.
 * @link : easy.spring.data.jpa.example.repository.UserRepository
 */
public interface UserRepository extends LogicJpaRepository<User, Long> {
    User findByName(String name);
}
