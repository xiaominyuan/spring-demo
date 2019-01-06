package com.yxm.dao;

public interface UpdateUser {
    public int updateLoginPassword(String userName,String password,String newpassword);
    public int updateAddress(String userName,String addrs,String newaddr);
    public int updateEmail(String userName,String email,String newemail);
    public int updatePhone(String userName,String userPhone,String newuserPhone);
    public int updatepayPassword(String userName,String paypassword,String newpaypassword);
    public int updateHead(String userName,String userHead,String newuserHead);
}
