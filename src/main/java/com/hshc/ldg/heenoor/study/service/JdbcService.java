package com.hshc.ldg.heenoor.study.service;

import com.hshc.ldg.heenoor.study.model.LoginModel;

import java.util.List;

/** 
 * @Description:  
 * @Author: lidongge
 * @Date: 2019/8/28 15:31
 */
public interface JdbcService {
    List<LoginModel> queryList();
}
