package com.yxm.tool;

import com.yxm.entity.forumreplyEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class forumreplyEntityRowMapper implements RowMapper<forumreplyEntity> {
    @Override
    public forumreplyEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        forumreplyEntity forumreply=new forumreplyEntity();
        forumreply.setReplyHead(resultSet.getString("replyHead"));
        forumreply.setReplyID(resultSet.getString("replyID"));
        forumreply.setReplyName(resultSet.getString("replyName"));
        forumreply.setReplyNeirong(resultSet.getString("replyNeirong"));
        forumreply.setReplytieziID(resultSet.getString("replyTiezi"));
        forumreply.setReplyTime((resultSet.getString("replyTime")));
        return forumreply;
    }
}
