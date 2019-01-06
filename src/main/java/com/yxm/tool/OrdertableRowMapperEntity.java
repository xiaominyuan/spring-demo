package com.yxm.tool;

import com.yxm.entity.ordertableEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrdertableRowMapperEntity implements RowMapper<ordertableEntity> {
    @Override
    public ordertableEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        ordertableEntity ordertable=new ordertableEntity();
        ordertable.setOrderID(resultSet.getString("orderID"));
        ordertable.setOrderAddrs(resultSet.getString("orderAddrs"));
        ordertable.setOrdergridImg(resultSet.getString("ordergridImg"));
        ordertable.setOrderGridName(resultSet.getString("ordergridName"));
        ordertable.setOrderStat(resultSet.getString("orderStat"));
        ordertable.setOrderSumRMB(resultSet.getString("orderSumRMB"));
        ordertable.setOrderTime(resultSet.getString("orderTime"));
        ordertable.setOrderUserName(resultSet.getString("orderUserName"));
        return ordertable;
    }
}
