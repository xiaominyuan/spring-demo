package com.yxm.service;

import com.yxm.entity.ShoppingCart;
import com.yxm.entity.forumEntity;
import com.yxm.entity.forumreplyEntity;
import com.yxm.entity.messageEntity;

public interface MessageService {
    public boolean message(messageEntity message);
    public boolean shoppingcart(ShoppingCart shoppingCart);
    public boolean forumtiezi(forumEntity forumtiezi);
    public boolean forumreply(forumreplyEntity forumreply);
}
