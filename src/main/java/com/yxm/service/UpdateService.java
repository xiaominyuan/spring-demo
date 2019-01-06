package com.yxm.service;


import com.yxm.entity.userEntity;

public interface UpdateService {
    public boolean updatePassword(String userName,String password,String newpassword);
    public boolean updateEmail(String userName,String email,String newemail);
    public boolean updatePhone(String userName,String phone,String newphone);
    public boolean updatePaypassword(String userName,String paypassword,String newpaypassword);
    public boolean updateHead(String userName,String head,String newhead);
    public boolean updateAddr(String userName, String ADDR,String newaddr);
    public boolean updateUser(userEntity user);
    public boolean deleteCart(String cartID);
}
