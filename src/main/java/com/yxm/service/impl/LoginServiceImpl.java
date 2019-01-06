package com.yxm.service.impl;

import com.yxm.dao.impl.LoginDaoImpl;
import com.yxm.entity.ordertableEntity;
import com.yxm.service.LoginService;

public class LoginServiceImpl implements LoginService {
    LoginDaoImpl loginDao;
    @Override
    public boolean loginuser(String userName, String password) {
        int num=loginDao.login(userName,password);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean paypassword(String userName, String paypassword) {
        int num=loginDao.paypassword(userName,paypassword);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateRMB(String userName, String userRMB) {
        int num=loginDao.updateRMB(userName,userRMB);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean ordertable(ordertableEntity ordertable) {
        int num=loginDao.ordertable(ordertable);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean confirmorder(String orderID) {
        int num=loginDao.comfirmOrder(orderID);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean cancelorder(String orderID) {
        int num=loginDao.cancelOrder(orderID);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteorder(String orderID) {
        int num=loginDao.deleteOrdertable(orderID);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delivergoods(String orderstat, String orderID) {
        int num=loginDao.sendGoods(orderstat,orderID);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }
}
