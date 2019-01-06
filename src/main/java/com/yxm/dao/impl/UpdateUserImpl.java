package com.yxm.dao.impl;

import com.sun.jmx.snmp.SnmpString;
import com.yxm.dao.UpdateUser;
import com.yxm.db.Data_jbdcTemplate;

public class UpdateUserImpl implements UpdateUser {
    Data_jbdcTemplate jdbcTemplate;
    @Override
    public int updateLoginPassword(String userName, String password, String newpassword) {
        int state=0;
        String sql="select count(*) from user where userNmae=? and password=?";
        int num=jdbcTemplate.getJdbcTemplate().queryForObject(sql,new Object[]{userName,password},Integer.class);
        if (num>0){
            System.out.println("大人请您修改密码");
            String sql2="update user set password=? and userName=?";
            state=jdbcTemplate.getJdbcTemplate().update(sql2,new Object[]{newpassword,userName});
        }else {
            System.out.println("请您先注册哦");
        }
        return state;
    }

    @Override
    public int updateAddress(String userName, String addrs, String newaddr) {
        int state=0;
        String sql="select count(*) fro user where userName=? and addrs=?";
        int num =jdbcTemplate.getJdbcTemplate().queryForObject(sql,new Object[]{userName,addrs},Integer.class);
        if (num>0){
            String sql2="update user set addr=? where userName=?";
            state=jdbcTemplate.getJdbcTemplate().update(sql2,new Object[]{newaddr,userName});

        }else {
            System.out.println("你不能改");

        }
        return state;
    }

    @Override
    public int updateEmail(String userName, String email, String newemail) {
        int state=0;
        String sql="select count(*) from user where userName=? and email=?";
        int num=jdbcTemplate.getJdbcTemplate().queryForObject(sql,new Object[]{userName,email},Integer.class);
        if (num>0){
            String sql2="update user set email=? where userName=?";
            state=jdbcTemplate.getJdbcTemplate().update(sql2,new Object[]{newemail,userName});
        }else {
            System.out.println("get out please");
        }
        return state;

    }

    @Override
    public int updatePhone(String userName, String userPhone, String newuserPhone) {
        int state=0;
        String sql="select count(*) from user where userName=? and userPhone=?";
        int num=jdbcTemplate.getJdbcTemplate().queryForObject(sql,new Object[]{userName,userPhone},Integer.class);
        if (num>0){
            String sql2="update user set email=? where userPhone=?";
            state=jdbcTemplate.getJdbcTemplate().update(sql2,new Object[]{newuserPhone,userName});
        }else {
            System.out.println("get out please");
        }
        return state;
    }

    @Override
    public int updatepayPassword(String userName, String paypassword, String newpaypassword) {
        int state=0;
        String sql="select count(*) from user where userName=? and paypassword=?";
        int num=jdbcTemplate.getJdbcTemplate().queryForObject(sql,new Object[]{userName,paypassword},Integer.class);
        if (num>0){
            String sql2="update user set paypassword=? where userPhone=?";
            state=jdbcTemplate.getJdbcTemplate().update(sql2,new Object[]{newpaypassword,userName});
        }else {
            System.out.println("get out please");
        }
        return state;
    }

    @Override
    public int updateHead(String userName, String userHead, String newuserHead) {
        int state=0;
        String sql="select count(*) from user where userName=? and userHead=?";
        int num=jdbcTemplate.getJdbcTemplate().queryForObject(sql,new Object[]{userName,userHead},Integer.class);
        if (num>0){
            String sql2="update user set userHead=? where userName=?";
            state=jdbcTemplate.getJdbcTemplate().update(sql2,new Object[]{userHead,userName});
        }else {
            System.out.println("get out please");
        }
        return state;
    }
}
