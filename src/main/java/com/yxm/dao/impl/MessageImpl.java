package com.yxm.dao.impl;

import com.yxm.dao.MessageDao;
import com.yxm.db.Data_jbdcTemplate;
import com.yxm.entity.ShoppingCart;
import com.yxm.entity.forumEntity;
import com.yxm.entity.forumreplyEntity;
import com.yxm.entity.messageEntity;

public class MessageImpl implements MessageDao {

    Data_jbdcTemplate jdbcTemplate;

    @Override
    public int message(messageEntity message) {
        String sql="insert into message(messageID,messagevideoID,messageuserID,"+
                "messageuserName,message,messageTime,messageHead)"+
                "value (?,?,?,?,?,?,?)";
        int num=jdbcTemplate.getJdbcTemplate().update(sql,new Object[]{message.getMessageID(),
        message.getMessageVideoID(),message.getMessageUserID(),message.getMessageName(),message.getMessage(),
        message.getMessageTime(),message.getMessageHead()});
        return num;
    }

    @Override
    public int shoppingCart(ShoppingCart shoppingcart) {
        String sql="insert into shoppingcart(cartID,userName,shoppingID,shoppingName,shoppingImg,shoppingPrice)"+
                "value (?,?,?,?,?,?)";
        int num=jdbcTemplate.getJdbcTemplate().update(sql,new Object[]{shoppingcart.getCartID(),
        shoppingcart.getShoppingID(),shoppingcart.getShoppingName(),
        shoppingcart.getShoppingImg(),shoppingcart.getShoppingPrice()});
        return num;
    }

    @Override
    public int forumTiezi(forumEntity forumEntity) {
        String sql="insert into forum(forumID,forumBT,forummessage,forumuserName,forumTime,forumKind,forumAmount,forumHead)"+
                "value(?,?,?,?,?,?,?,?)";
        int num=jdbcTemplate.getJdbcTemplate().update(sql,new Object[]{forumEntity.getForumID(),
        forumEntity.getForummessage(),forumEntity.getForumuserName(),
        forumEntity.getForumTime(),forumEntity.getForumKind(),
        forumEntity.getForumAmount(),forumEntity.getForumHead()});
        return num;
    }

    @Override
    public int forumreply(forumreplyEntity forumreply) {
        String sql="insert into forumreply (replyID,replyNeirong,replyTime,replyHead,replytieziID,replyName)"+
                "value (?,?,?,?,?,?)";
        int num=jdbcTemplate.getJdbcTemplate().update(sql,new Object[]{forumreply.getReplyID(),
        forumreply.getReplyNeirong(),forumreply.getReplyHead(),
        forumreply.getReplyID(),forumreply.getReplyName()});
        return num;
    }
}
