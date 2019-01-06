package com.yxm.tool;

import com.yxm.entity.ShoppingCart;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ShoppingCartRowMapperEntity implements RowMapper<ShoppingCart> {
    @Override
    public ShoppingCart mapRow(ResultSet resultSet, int i) throws SQLException {
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.setCartID(resultSet.getString("cartID"));
        shoppingCart.setShoppingID(resultSet.getString("shoppingID"));
        shoppingCart.setShoppingImg(resultSet.getString("shoppingImg"));
        shoppingCart.setShoppingName(resultSet.getString("shoppingName"));
        shoppingCart.setUserName(resultSet.getString("userName"));
        shoppingCart.setShoppingPrice(resultSet.getString("shoppingPrice"));
        return shoppingCart;
    }
}
