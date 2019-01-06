package com.yxm.service.impl;

import com.yxm.dao.impl.RegisterImpl;
import com.yxm.entity.userEntity;
import com.yxm.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {
    RegisterImpl registerimpl;
    @Override
    public boolean registerService(userEntity user) {
        int num=registerimpl.Register(user);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }
}
