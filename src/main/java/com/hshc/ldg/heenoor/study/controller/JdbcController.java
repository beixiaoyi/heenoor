package com.hshc.ldg.heenoor.study.controller;

import com.hshc.ldg.heenoor.study.common.thread.handle.DemoThreadTest;
import com.hshc.ldg.heenoor.study.baseEnums.EnumUtil;
import com.hshc.ldg.heenoor.study.enums.PlateTypeEnum;
import com.hshc.ldg.heenoor.study.model.LoginModel;
import com.hshc.ldg.heenoor.study.service.JdbcService;
import com.hshc.ldg.heenoor.study.util.ListUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Description: demo
 * @Author: lidongge
 * @Date: 2019/3/12 14:53
 */
@Slf4j
@Controller
@RequestMapping("/jdbc")
public class JdbcController {

    /**
     * Spring连接Mysql的方式有很多，例如JDBC，Spring JPA，Hibeirnate，Mybatis等，
     * 本文主要介绍使用最简单、最底层的JDBC方式来连接Mysql数据库，JDBC连接数据库，
     * 主要是注入JdbcTemplate，使用JdbcTemplate来操作数据库。
     *  ————————————————
     * 版权声明：本文为CSDN博主「乾源」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/u014553029/article/details/80971878
     */

    @Autowired
    private JdbcService jdbcService;

    @Resource
    private ExecutorService ex;

    /**
     * 最大线程数
     */
    private static final int MAX_THREAD_COUNT = 4;

    public  static final int LATCH_TIME_OUT = 8 ;

    /**
     * jdbc使用范例
     *
     * 枚举Enum 使用范例
     *
     * @param modelAndView
     * @param req
     * @return
     * @throws InterruptedException
     */
    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView, HttpServletRequest req) throws InterruptedException {
        modelAndView.setViewName("/web/demo/demo");

//        List<LoginModel> loginModels = jdbcService.queryList();

//        long startTime0 = System.currentTimeMillis();
//        for (LoginModel model:loginModels) {
//            log.info("哈哈哈：{}",model.getSysCode());
//        }
//        long endTime0 = System.currentTimeMillis();
//        log.info("正常打印 耗时："+ (endTime0 - startTime0) + " ms");

//        this.studyThread(loginModels);

        //Enum
        modelAndView.addObject("plateTypeEnum",EnumUtil.getList(PlateTypeEnum.class));


        return modelAndView;
    }

    /**
     * CountDownLatch 使用范例
     * @param loginModels
     * @throws InterruptedException
     */
    public void studyThread(List<LoginModel> loginModels) throws InterruptedException{
        //讲查询列表按线程数分组
        Map spiltMap = ListUtils.spiltList(loginModels, MAX_THREAD_COUNT);
        //等待4个线程
        CountDownLatch count = new CountDownLatch(MAX_THREAD_COUNT);
        //多线程请求执行开始
        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i < MAX_THREAD_COUNT; i++) {
            try {
                ex.execute(new DemoThreadTest((List<LoginModel>)spiltMap.get(i),count));
            } catch (Exception e) {
                log.error("线程执行中出现异常提前结束", e);
                count.countDown();
                log.error("剩余任务数量：{}", count.getCount());
                e.printStackTrace();
            } finally {
                ex.shutdown();
            }
        }

        //6小时超时
//        count.await(LATCH_TIME_OUT, TimeUnit.HOURS);
        //10秒超时 :超时之前 还未走完线程 会直接走主线
        count.await(10, TimeUnit.SECONDS);

        long endTime = System.currentTimeMillis();
        log.info("多线程打印 耗时："+ (endTime - startTime) + " ms");
    }

}
