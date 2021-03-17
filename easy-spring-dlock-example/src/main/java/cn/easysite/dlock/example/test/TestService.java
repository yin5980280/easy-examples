/*
 *  @Copyright : Copyright (c) 2021
 *  @Company : EasySite Technology 阿富汗 Co. Ltd.
 */
package cn.easysite.dlock.example.test;

import org.springframework.stereotype.Service;

import cn.org.easysite.spring.boot.distributed.lock.annotation.DLock;
import cn.org.easysite.spring.boot.distributed.lock.annotation.DLockKey;

/**
 * @author : 潘多拉
 * @version : 1.0
 * @date : 2021/3/17 11:12 上午
 * @link : cn.easysite.dlock.example.test.TestService
 */
@Service
public class TestService {

    @DLock(name = "test", required = true)
    public boolean testLock(@DLockKey String key) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    @DLock(name= "test", tried = false,  required = true)
    public boolean testLockex(@DLockKey String key) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
