package com.yxm.tool;

import com.yxm.entity.forumEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class forumEntityRowMapper implements RowMapper<forumEntity> {
    @Override
    public forumEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        forumEntity forum=new forumEntity();
        forum.setForumID(resultSet.getString("forumID"));
        forum.setForumAmount(resultSet.getString("forumAmount"));
        forum.setForumBT(resultSet.getString("forumBT"));
        forum.setForumHead(resultSet.getString("forumHead"));
        forum.setForumKind(resultSet.getString("forumKind"));
        forum.setForummessage(resultSet.getString("forumMessage"));
        forum.setForumTime(resultSet.getString("forumTime"));
        forum.setForumuserName(resultSet.getString("forumuserName"));
        return forum;
    }
}
