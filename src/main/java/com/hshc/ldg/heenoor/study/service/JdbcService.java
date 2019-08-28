package com.hshc.ldg.heenoor.study.service;

import com.hshc.ldg.heenoor.study.model.LoginModel;

import java.util.List;

/** 
 * @Description:  
 * @Author: lidongge
 * @Date: 2019/8/28 16:19
 */
public interface JdbcService {
    List<LoginModel> queryList();
}
