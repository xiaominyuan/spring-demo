package com.yxm.dao.impl;

import com.yxm.dao.LoginDao;
import com.yxm.db.Data_jbdcTemplate;
import com.yxm.entity.ordertableEntity;



public class LoginDaoImpl implements LoginDao {

    Data_jbdcTemplate jbdcTemplate;
    @Override
    public int login(String userName, String passWord) {
        String sql="select count(*) from user where userName=? and password=?";
        int num = jbdcTemplate.getJdbcTemplate().queryForObject(sql, new Object[]{userName, passWord},Integer.class);
        return num;
    }

    @Override
    public int paypassword(String userName, String pass) {
        String sql="select count(*) from user where userName=? and userPayPassword=?";
        int num=jbdcTemplate.getJdbcTemplate().queryForObject(sql,new Object[]{userName,pass},Integer.class);
        return num;
    }

    @Override
    public int updateRMB(String userRMB, String userName) {
        String sql="update user set userRMB=? where userName=?";
        int num=jbdcTemplate.getJdbcTemplate().update(sql,new Object[]{userRMB,userName});
        return num;
    }

    @Override
    public int ordertable(ordertableEntity ordertable) {
        String sql="insert into user (orderID,orderuserName,ordergirdsname,orderImg,orderSumPrice,orderStat,orderTime,orderAddr) values(?,?,?,?,?,?,?,?)";
        int num= jbdcTemplate.getJdbcTemplate().update(sql,new Object[]{ordertable.getOrderID(), ordertable.getOrderUserName(),ordertable.getOrderGridName(),ordertable.getOrdergridImg(), ordertable.getOrderSumRMB(),ordertable.getOrderStat(),ordertable.getOrderTime(),ordertable.getOrderAddrs()});
        return num;
    }

    @Override
    public int comfirmOrder(String orderID) {
        int b;
        String sql="select count(*) from ordertable where orderID=? and orderStat=2";
        int num=jbdcTemplate.getJdbcTemplate().queryForObject(sql,new Object[]{orderID},Integer.class);
        if (num>0){
            String sql2="update ordertable set orderStat=4 where orderID=?";
            b=jbdcTemplate.getJdbcTemplate().update(sql2,new Object[]{orderID});
        }else {
            b=0;
        }
        return b;

    }

    @Override
    public int cancelOrder(String orderID) {
        String sql="update ordertable set orderStat=4 where orderID=?";
        int num=jbdcTemplate.getJdbcTemplate().update(sql,new Object[]{orderID});
        return num;
    }

    @Override
    public int deleteOrdertable(String orderID) {
        String sql="update ordertable set orderStat=5 where orderID=?";
        int num;
        num = jbdcTemplate.getJdbcTemplate().update(sql,new Object[]{orderID});
        return num;
    }

    @Override
    public int sendGoods(String orderStat, String orderID) {
        String sql="update ordertable set orderStat=? where orderID=?";
        int num = jbdcTemplate.getJdbcTemplate().update(sql, new Object[]{orderStat, orderID});
        return num;
    }
}
