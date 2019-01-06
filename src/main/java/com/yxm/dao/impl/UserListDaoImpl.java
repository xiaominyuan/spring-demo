package com.yxm.dao.impl;

import com.yxm.dao.UserListDao;
import com.yxm.db.Data_jbdcTemplate;
import com.yxm.entity.*;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class UserListDaoImpl implements UserListDao {
    Data_jbdcTemplate jdbcTemplate;
    @Override
    public userEntity userlist(String userName) {
        String sql="select * from user where userName=?";
        userEntity user=jdbcTemplate.getJdbcTemplate().queryForObject(sql, new Object[]{userName}, new rowmapperE {
        })
    }

    @Override
    public forumEntity forumentity(String forumid) {
        return null;
    }

    @Override
    public List<userEntity> userlistuserName(String userName) {
        return null;
    }

    @Override
    public List<videoEntity> videolist(String videocategory) {
        return null;
    }

    @Override
    public List<videoEntity> videolistlinit7() {
        return null;
    }

    @Override
    public List<videoEntity> videolistlimit5() {
        return null;
    }

    @Override
    public List<videoEntity> videolistlimit6() {
        return null;
    }

    @Override
    public List<forumreplyEntity> forumreply(String forumreplyID) {
        return null;
    }

    @Override
    public List<messageEntity> messagelist(String videoID) {
        return null;
    }

    @Override
    public List<userEntity> userlistpage(int pageint) {
        return null;
    }

    @Override
    public List<userEntity> userlistmohu(String usermohu) {
        return null;
    }

    @Override
    public List<userEntity> userphone(String userphone) {
        return null;
    }

    @Override
    public List<userEntity> userid(String userid) {
        return null;
    }

    @Override
    public List<userEntity> userstat(String userstat) {
        return null;
    }

    @Override
    public List<videoEntity> pagevideolist(String state, int currentPage, int numPerPage) {
        return null;
    }

    @Override
    public int videocount(String countvideo) {
        return 0;
    }

    @Override
    public List<gridsEntity> gridIDlist(String gridid) {
        return null;
    }

    @Override
    public gridsEntity grididlist(String gridid) {
        return null;
    }

    @Override
    public List<ShoppingCart> shoppingcart(String userName) {
        return null;
    }

    @Override
    public List<forumEntity> forumEntity(String forumkind) {
        return null;
    }

    @Override
    public List<ordertableEntity> ordertable(String userName) {
        return null;
    }

    @Override
    public List<ordertableEntity> ordertablelist() {
        return null;
    }

    @Override
    public List<ordertableEntity> orderstat(String orderstat) {
        return null;
    }

    @Override
    public int countordertable() {
        return 0;
    }

    @Override
    public int counttable(String tablename) {
        return 0;
    }
}
