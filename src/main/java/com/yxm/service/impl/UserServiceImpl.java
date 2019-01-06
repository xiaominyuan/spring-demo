package com.yxm.service.impl;

import com.yxm.dao.impl.UserListDaoImpl;
import com.yxm.entity.*;
import com.yxm.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserListDaoImpl userListDaoImpl;
    @Override
    public userEntity userList(String userName) {
        userEntity user=userListDaoImpl.userlist(userName);
        return user;
    }

    @Override
    public List<userEntity> userListUserName(String userName) {
        List<userEntity> user=userListDaoImpl.userlistuserName(userName);
        return user;
    }

    @Override
    public forumEntity forumentity(String forumID) {
        forumEntity forumEntity=userListDaoImpl.forumentity(forumID);
        return forumEntity;
    }

    @Override
    public List<forumreplyEntity> forumreply(String forumreplyID) {
        List<forumreplyEntity> list=userListDaoImpl.forumreply(forumreplyID);
        return list;
    }

    @Override
    public List<videoEntity> videoList(String videoCategory) {
        List<videoEntity> list=userListDaoImpl.videolist(videoCategory);
        return list;
    }

    @Override
    public List<videoEntity> videoList7() {
        List<videoEntity> list=userListDaoImpl.videolistlinit7();
        return list;
    }

    @Override
    public List<videoEntity> videoList6() {
        List<videoEntity> list=userListDaoImpl.videolistlimit6();
        return list;
    }

    @Override
    public List<videoEntity> videoList5() {
        List<videoEntity> list=userListDaoImpl.videolistlimit5();
        return list;
    }

    @Override
    public List<messageEntity> messageList(String videoID) {
        List<messageEntity> list=userListDaoImpl.messagelist(videoID);
        return list;
    }

    @Override
    public List<userEntity> userlistPage(int pageInt) {
        List<userEntity> list=userListDaoImpl.userlistpage(pageInt);
        return list;
    }
}
