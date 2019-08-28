package com.hshc.ldg.heenoor.study.dao.impl;

import com.hshc.ldg.heenoor.study.dao.JdbcDao;
import com.hshc.ldg.heenoor.study.model.LoginModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author: lidongge
 * @Date: 2019/8/28 15:30
 */
@Repository
public class JdbcDaoImpl implements JdbcDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<LoginModel> queryList() {
        String sql = "select * from h_login";
        return jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<LoginModel>(LoginModel.class));
    }
}
