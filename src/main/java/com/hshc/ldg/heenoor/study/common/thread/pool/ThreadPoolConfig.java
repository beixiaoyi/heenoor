package com.hshc.ldg.heenoor.study.common.thread.pool;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zp
 * @Description: 自定义线程池
 * @date 2018/11/05 上午9:59
 */
@Slf4j
@Configuration
public class ThreadPoolConfig {

    @Bean
    public ExecutorService getThreadPool() {
        ExecutorService es = new ThreadPoolExecutor(10, 20, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(),new NamedThreadFactory("heenoor")) {

            @Override
            public void beforeExecute(Thread t, Runnable r) {
                super.beforeExecute(t, r);
                log.info("===》工作线程：{} ，任务线程：{}准备执行",((Thread) r).getName(),t.getName());
            }

            @Override
            public void afterExecute(Runnable r, Throwable t) {
                super.afterExecute(r, t);
                log.info("===》工作线程{}执行完成", ((Thread) r).getName(),t);
            }

            @Override
            public void terminated() {
                super.terminated();
                log.info("===》线程池退出");
            }

            @Override
            public void execute(Runnable job) {
                super.execute(wrap(job, clientTrace(), Thread.currentThread().getName()));
            }
            //捕获异常
            private Runnable wrap(Runnable job, Exception clientTrace, String name) {
                return new Thread(){
                    @Override
                    public void run(){

                        try {
                            job.run();
                        } catch (Exception e) {
                            log.error("===》线程池中线程执行出现异常：{} ,e:{}", clientTrace,e);
                        }
                    }

                };
            }

            private Exception clientTrace() {
                return new Exception("client statck trace");
            }
        };
        return es;
    }
}
