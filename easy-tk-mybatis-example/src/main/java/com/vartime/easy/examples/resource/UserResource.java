package com.vartime.easy.examples.resource;

import com.vartime.easy.examples.entity.User;
import com.vartime.easy.examples.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import cn.org.easysite.commons.base.Response;
import cn.org.easysite.framework.exception.BaseException;
import cn.org.easysite.spring.boot.validator.annotation.Validate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-01-29 10:55
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : KeRuYun Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.exes.resource.UserResource
 */
@RestController
@Api(tags = "测试接口")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    @ApiOperation(notes = "获取所有用户", value = "获取所有用户")
    public List<User> users() {
       return userService.selectAll();
    }

    @GetMapping("user/{id}")
    @ApiOperation(notes = "通过id查找用户", value = "通过id查找用户")
    public Response<User> user(@PathVariable("id") Long id) {
        return Response.build(userService.selectByPk(id));
    }


    @GetMapping("user/exception")
    @ApiOperation(notes = "测试异常", value = "测试异常")
    public User exception() {
        throw new BaseException(1014, "测试异常");
    }


    @GetMapping("user/null")
    @ApiOperation(notes = "测试返回空", value = "测试返回空")
    public User testNull() {
        return null;
    }

    @PostMapping("user/validate")
    @ApiOperation(notes = "测试验证", value = "测试验证")
    @Validate
    public User testValidate(@RequestBody User user) {
        return user;
    }
}
