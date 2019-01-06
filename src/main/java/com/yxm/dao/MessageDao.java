package com.yxm.dao;

import com.yxm.entity.ShoppingCart;
import com.yxm.entity.forumEntity;
import com.yxm.entity.forumreplyEntity;
import com.yxm.entity.messageEntity;

public interface MessageDao {
    public int message(messageEntity message);
    public int shoppingCart(ShoppingCart shoppingcart);
    public int forumTiezi(forumEntity forumEntity);
    public int forumreply(forumreplyEntity forumreply);

}
