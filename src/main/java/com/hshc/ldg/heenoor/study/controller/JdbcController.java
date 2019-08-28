package com.hshc.ldg.heenoor.study.controller;

import com.hshc.ldg.heenoor.study.model.LoginModel;
import com.hshc.ldg.heenoor.study.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Description: demo
 * @Author: lidongge
 * @Date: 2019/3/12 14:53
 */
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

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView, HttpServletRequest req) {
        modelAndView.setViewName("/web/demo/demo");

        List<LoginModel> loginModels = jdbcService.queryList();

        for (LoginModel model:loginModels) {
            System.out.println(model.getSysCode());
        }

        return modelAndView;
    }


}
