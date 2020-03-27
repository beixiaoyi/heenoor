package com.hshc.ldg.heenoor.study.controller;

import com.hshc.ldg.heenoor.study.model.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

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


    public static void main(String args[]){
//        int a1[] = {1,2,3};
//        int s[] = Arrays.copyOf(a1,100);
        String s1 = new String("123");
        String s2 = new String("123");
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        System.out.println(list.get(0).hashCode());
        System.out.println(list.get(1).hashCode());
        System.out.println(s1.equals(s2));

        LoginModel loginModel = new LoginModel();
        LoginModel loginModel2 = new LoginModel();
        System.out.println(loginModel.equals(loginModel2));
        System.out.println(s1 == s2);


        Map map = new HashMap(16);
        map.put("1",1);
        map.put("2",2);
        Set set = map.entrySet();
        for (int i=0;i<set.size();i++) {
            Iterator iterator = set.iterator();
        }




    }
}
