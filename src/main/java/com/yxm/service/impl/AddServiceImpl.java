package com.yxm.service.impl;

import com.yxm.dao.impl.LoginDaoImpl;
import com.yxm.service.AddService;

public class AddServiceImpl implements AddService {
    LoginDaoImpl login;
    @Override
    public boolean login() {
        int num=login.login("1","1");
        if (num>0){
            return true;
        }else {
            return false;
        }
    }
}
