package com.yxm.tool;


import com.yxm.entity.messageEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageRowMapperEntity implements RowMapper<messageEntity> {
    @Override
    public messageEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        messageEntity message=new messageEntity();
        message.setMessage(resultSet.getString("message"));
        message.setMessageHead(resultSet.getString("messageHead"));
        message.setMessageID(resultSet.getString("messageID"));
        message.setMessageName(resultSet.getString("messageName"));
        message.setMessageHead(resultSet.getString("messageHead"));
        message.setMessageUserID(resultSet.getString("messageuserID"));
        message.setMessageVideoID(resultSet.getString("messagevideoID"));
        return message;
    }
}
