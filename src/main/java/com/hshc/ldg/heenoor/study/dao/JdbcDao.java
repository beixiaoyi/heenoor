package com.hshc.ldg.heenoor.study.dao;

import com.hshc.ldg.heenoor.study.model.LoginModel;

import java.util.List;

public interface JdbcDao {
    List<LoginModel> queryList();
}
