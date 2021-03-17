/*
 *  @Copyright : Copyright (c) 2021
 *  @Company : EasySite Technology 阿富汗 Co. Ltd.
 */
package cn.easysite.dlock.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : 潘多拉
 * @version : 1.0
 * @date : 2021/3/17 11:14 上午
 * @link : cn.easysite.dlock.example.test.TestController
 */
@RestController
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("lock")
    public boolean lock(String key) {
        return testService.testLock(key);
    }

    @GetMapping("lockex")
    public boolean lockex(String key) {
        return testService.testLockex(key);
    }
}
