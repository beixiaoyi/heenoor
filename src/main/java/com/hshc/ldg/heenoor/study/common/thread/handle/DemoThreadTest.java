package com.hshc.ldg.heenoor.study.common.thread.handle;

import com.hshc.ldg.heenoor.study.model.LoginModel;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @Description:
 * @Author: lidongge
 * @Date: 2019/10/29 10:47
 */
@Slf4j
public class DemoThreadTest implements Runnable{

    /**
     * 待遍历列表
     */
    List<LoginModel> loginModels;

    private CountDownLatch count;

    public DemoThreadTest(List<LoginModel> loginModels, CountDownLatch count){
        this.loginModels = loginModels;
        this.count = count;
    }

    @Override
    public void run() {

        log.info("线程名称：{}，本线程要打印的次数：{}",Thread.currentThread().getName(),
                loginModels.size());

        for (int i =0; i < loginModels.size(); i++) {
            log.info("循环线程名称：{},用户code:{}",Thread.currentThread().getName(),
                    loginModels.get(i).getSysCode());
        }

        count.countDown();
        log.info("剩余任务数量：{}", count.getCount());

    }
}
