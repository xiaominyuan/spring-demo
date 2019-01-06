package com.yxm.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Data_jbdcTemplate {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }
}
