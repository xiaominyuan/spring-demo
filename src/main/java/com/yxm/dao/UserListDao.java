package com.yxm.dao;

import com.yxm.entity.*;

import java.util.List;

public interface UserListDao {
    public userEntity userlist(String userName);
    public forumEntity forumentity(String forumid);
    public List<userEntity> userlistuserName(String userName);
    public List<videoEntity> videolist(String videocategory);
    public List<videoEntity> videolistlinit7();
    public List<videoEntity> videolistlimit5();
    public List<videoEntity> videolistlimit6();
    public List<forumreplyEntity> forumreply(String forumreplyID);
    public List<messageEntity> messagelist(String videoID);
    public List<userEntity> userlistpage(int pageint);
    public List<userEntity> userlistmohu(String usermohu);
    public List<userEntity> userphone(String userphone);
    public List<userEntity> userid(String userid);
    public List<userEntity> userstat(String userstat);
    public List<videoEntity> pagevideolist(String state,int currentPage,int numPerPage);
    public int videocount(String countvideo);
    public List<gridsEntity> gridIDlist(String gridid);
    public gridsEntity grididlist(String gridid);
    public List<ShoppingCart> shoppingcart(String userName);
    public List<forumEntity> forumEntity(String forumkind);
    public List<ordertableEntity> ordertable(String userName);
    public List<ordertableEntity> ordertablelist();
    public List<ordertableEntity> orderstat(String orderstat);
    public int countordertable();
    public int counttable(String tablename);

}
