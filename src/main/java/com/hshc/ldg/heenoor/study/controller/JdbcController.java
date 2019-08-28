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
