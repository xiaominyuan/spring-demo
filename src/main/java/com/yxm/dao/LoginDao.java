package com.yxm.dao;

import com.yxm.entity.ordertableEntity;

public interface LoginDao {
    public int login(String userName,String passWord);
    public int paypassword(String userName,String pass);
    public int updateRMB(String userRMB,String userName);
    public int ordertable(ordertableEntity ordertable);
    public int comfirmOrder(String orderID);
    public int cancelOrder(String orderID);
    public int deleteOrdertable(String orderID);
    public int sendGoods(String orderStat,String orderID);

}
