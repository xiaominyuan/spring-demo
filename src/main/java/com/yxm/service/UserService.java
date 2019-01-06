package com.yxm.service;

import com.yxm.entity.*;

import java.util.List;

public interface UserService {
    public userEntity userList(String userName);
    public List<userEntity> userListUserName(String userName);
    public forumEntity forumentity(String forumID);
    public List<forumreplyEntity> forumreply(String forumreplyID);
    public List<videoEntity> videoList(String videoCategory);
    public List<videoEntity> videoList7();
    public List<videoEntity> videoList6();
    public List<videoEntity> videoList5();
    public List<messageEntity> messageList(String videoID);
    public List<userEntity> userlistPage(int pageInt);
}
