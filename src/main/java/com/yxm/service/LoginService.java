package com.yxm.service;

import com.yxm.entity.ordertableEntity;

public interface LoginService {
    public boolean loginuser(String userName,String password);
    public boolean paypassword(String userName,String paypassword);
    public boolean updateRMB(String userName,String userRMB);
    public boolean ordertable(ordertableEntity ordertable);
    public boolean confirmorder(String orderID);
    public boolean cancelorder(String orderID);
    public boolean deleteorder(String orderID);
    public boolean delivergoods(String orderstat,String orderID);
}
