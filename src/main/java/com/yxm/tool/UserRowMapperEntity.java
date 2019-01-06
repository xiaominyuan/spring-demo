package com.yxm.tool;

import com.yxm.entity.userEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapperEntity implements RowMapper<userEntity> {
    @Override
    public userEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        userEntity user=new userEntity();
        user.setuserID(resultSet.getString("userID"));
        user.setPassword(resultSet.getString("Password"));
        user.setUserAddrs(resultSet.getString("userAddrs"));
        user.setUserCollection(resultSet.getString("userCollection"));
        user.setUserEmail(resultSet.getString("userEmail"));
        user.setUserHead(resultSet.getString("userHead"));
        user.setUserIP(resultSet.getString("userIP"));
        user.setUserLoginTime(resultSet.getString("userloginTime"));
        user.setUserPaypassword(resultSet.getString("userpayPassword"));
        user.setUserName(resultSet.getString("userName"));
        user.setUserPhone(resultSet.getString("userPhone"));
        user.setUserQQ(resultSet.getString("userQQ"));
        user.setUserRestRMB(resultSet.getString("userRestRMB"));
        user.setUserSex(resultSet.getString("userSex"));
        user.setUserStat(resultSet.getString("userStat"));
        user.setUseryinghangka(resultSet.getString("useryingkangka"));
        user.setUserZhenName(resultSet.getString("userZhenName"));
        return user;
    }
}
