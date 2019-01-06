package com.yxm.service.impl;

import com.yxm.dao.impl.UpdateUserImpl;
import com.yxm.entity.userEntity;
import com.yxm.service.UpdateService;

public class UpdateServiceImpl implements UpdateService {
    UpdateUserImpl updateUserimpl;
    @Override
    public boolean updatePassword(String userName, String password, String newpassword) {
        int num=updateUserimpl.updateLoginPassword(userName,password,newpassword);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateEmail(String userName, String email, String newemail) {
        int num=updateUserimpl.updateEmail(userName,email,newemail);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updatePhone(String userName, String phone, String newphone) {
        int num=updateUserimpl.updatePhone(userName,phone,newphone);
        if(num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updatePaypassword(String userName, String paypassword, String newpaypassword) {
        int num=updateUserimpl.updatepayPassword(userName,paypassword,newpaypassword);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateHead(String userName, String head, String newhead) {
        int num=updateUserimpl.updateHead(userName,head,newhead);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateAddr(String userName, String ADDR, String newaddr) {
        int num=updateUserimpl.updateAddress(userName,ADDR,newaddr);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateUser(userEntity user) {
        return false;
    }

    @Override
    public boolean deleteCart(String cartID) {
        return false;
    }
}
