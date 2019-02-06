package com.vartime.easy.examples.resource;

import com.vartime.easy.examples.entity.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-01-30 18:31
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : KeRuYun Technology(Beijing) Chengdu Co. Ltd.
 * @link : com.vartime.easy.examples.resource.TestController
 */
@Controller
public class TestController {
    @RequestMapping("index.html")
    public String index() {
        return "index";
    }

    @RequestMapping("index/user")
    @ResponseBody
    public User user() {
        return null;
    }
}
