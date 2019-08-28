package com.hshc.ldg.heenoor.study.service.impl;

import com.hshc.ldg.heenoor.study.dao.JdbcDao;
import com.hshc.ldg.heenoor.study.model.LoginModel;
import com.hshc.ldg.heenoor.study.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: lidongge
 * @Date: 2019/8/28 15:30
 */
@Service
public class JdbcServiceImpl implements JdbcService {

    @Autowired
    private JdbcDao jdbcDao;

    @Override
    public List<LoginModel> queryList() {
        return jdbcDao.queryList();
    }
}
