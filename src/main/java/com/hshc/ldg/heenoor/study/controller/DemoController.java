package com.hshc.ldg.heenoor.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: demo
 * @Author: lidongge
 * @Date: 2019/3/12 14:53
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView modelAndView, HttpServletRequest req) {

        modelAndView.setViewName("/web/demo/demo");
        return modelAndView;
    }


}
