package com.hshc.ldg.heenoor.study.util;

import groovy.util.logging.Slf4j;

import java.util.HashMap;
import java.util.Map;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

@Slf4j
public class HttpClientTest {

//    private static Logger logger = LoggerFactory.getLogger(HttpRequestTest.class);

    public static void main(String[] args) {

//        getRequestTest();
//        getRequestTest2();
        postRequestTest();
    }

    private static void getRequestTest() {

        String url = "http://localhost:8080/SpringMVC/greeting?name=lisi";
        try {
            String str = HttpClientUtil.doGet(url, "UTF-8");
            if (str != null) {
                System.out.println("http Get request result:" + str);
            } else {
                System.out.println("http Get request process fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getRequestTest2() {

        String url = "http://localhost:8080/SpringMVC/greeting?name=lisi";
        try {
            String str = HttpClientUtil.doGet2(url, "UTF-8");
            if (str != null) {
                System.out.println("http Get request result:" + str);
            } else {
                System.out.println("http Get request process fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void postRequestTest() {

        String url = "http://localhost:8080/heenoor/hello/processing";

        Map<String, Object> _params = new HashMap<String, Object>();
        _params.put("name", "zhangshang");
        _params.put("age", 25);
        String str = HttpClientUtil.doPost(url, _params, "UTF-8", true);
        if (str != null) {
            System.out.println("http Post request result:" + str);
        } else {
            System.out.println("http Post request process fail");
        }
    }
}

