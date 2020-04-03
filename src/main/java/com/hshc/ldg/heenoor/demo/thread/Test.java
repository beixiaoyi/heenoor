package com.hshc.ldg.heenoor.demo.thread;

import static java.lang.Math.ceil;

/**
 * @Description:
 * @Author: lidongge
 * @Date: 2020/3/31 22:32
 */
public class Test {


    public static void main(String[] args) {
        /**
         * @Description: 线程启动方式
         * @Author: lidongge
         * @Date: 2020/3/31 22:48
         */
        ExtendsThread th1 = new ExtendsThread();
        th1.start();

        ImplRunnable im1 = new ImplRunnable();
        Thread thread = new Thread(im1);
        thread.start();

        System.out.println("--"+ceil(3/2));


    }
}
