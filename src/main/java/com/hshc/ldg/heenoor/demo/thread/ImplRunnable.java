package com.hshc.ldg.heenoor.demo.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: lidongge
 * @Date: 2020/3/31 22:41
 */
@Slf4j
public class ImplRunnable implements Runnable {
    @Override
    public void run() {
        log.info("---ImplRunnable implements Runnable Run();");
    }
}
