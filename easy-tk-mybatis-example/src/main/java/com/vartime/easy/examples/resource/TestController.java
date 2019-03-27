package com.vartime.easy.examples.resource;

import com.vartime.easy.examples.entity.User;
import com.vartime.easy.examples.service.CoinService;
import com.vartime.easy.examples.service.impl.Publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.org.easysite.commons.utils.Encodes;

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

    @Autowired
    private Publisher publisher;

    @Autowired
    private CoinService coinService;

    @RequestMapping("index.html")
    public String index() {
        return "index";
    }

    @RequestMapping("index/user")
    @ResponseBody
    public User user(@RequestParam("content") String content) {
        System.out.println(Encodes.decodeBase64String(content));
        System.out.println(content.replaceAll(" ", "+"));
        System.out.println(Encodes.decodeBase64String(content.replaceAll(" ", "+")));
        return null;
    }

    @RequestMapping("test/publish/{msg}")
    @ResponseBody
    public String publish(@PathVariable("msg") String msg) {
        publisher.publish(msg);
        return "发布成功：" + msg;
    }

    @RequestMapping("test/coin")
    @ResponseBody
    public Boolean coin() {
        coinService.processor();
        return true;
    }

}
