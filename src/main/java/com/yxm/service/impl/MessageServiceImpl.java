package com.yxm.service.impl;

import com.yxm.dao.impl.MessageImpl;
import com.yxm.entity.ShoppingCart;
import com.yxm.entity.forumEntity;
import com.yxm.entity.forumreplyEntity;
import com.yxm.entity.messageEntity;
import com.yxm.service.MessageService;

public class MessageServiceImpl implements MessageService {
    MessageImpl messageimpl;
    @Override
    public boolean message(messageEntity message) {
        int num=messageimpl.message(message);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean shoppingcart(ShoppingCart shoppingCart) {
        int num=messageimpl.shoppingCart(shoppingCart);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean forumtiezi(forumEntity forumtiezi) {
        int num=messageimpl.forumTiezi(forumtiezi);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean forumreply(forumreplyEntity forumreply) {
        int num=messageimpl.forumreply(forumreply);
        if (num>0){
            return true;
        }else {
            return false;
        }
    }
}
