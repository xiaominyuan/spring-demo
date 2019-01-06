package com.yxm.dao.impl;

import com.yxm.dao.RegisterDao;
import com.yxm.db.Data_jbdcTemplate;
import com.yxm.entity.userEntity;

public class RegisterImpl implements RegisterDao {
    Data_jbdcTemplate jdbcTemplate;
    @Override
    public int Register(userEntity user) {
        int register=0;
        String sql="select count(*) from user where userName=?";
        int num=jdbcTemplate.getJdbcTemplate().queryForObject(sql,new Object[]{user.getUserName()},Integer.class);
        if (num>0){
            System.out.println("这个人已经被注册过了哦！");
        }else {
            String sql2="insert into user(userID,userName,passWord,userPhone,userState"+
                    ",userEmail,userHead,userPaypassword) value (?,?,?,?,?,?,?,?)";
            register=jdbcTemplate.getJdbcTemplate().update(sql2,new Object[]{user.getID(),
            user.getUserName(),user.getPassword(),user.getUserPhone(),user.getUserStat(),
            user.getUserEmail(),user.getUserHead(),user.getUserPaypassword()});

        }
        return register;
    }
}
