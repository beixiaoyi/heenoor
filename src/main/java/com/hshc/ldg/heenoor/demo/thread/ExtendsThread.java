package com.hshc.ldg.heenoor.demo.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: lidongge
 * @Date: 2020/3/31 22:30
 */
@Slf4j
public class ExtendsThread extends Thread{
    @Override
    public void run() {
        log.info("---ExtendsThread extends Thread run();");
    }
}
