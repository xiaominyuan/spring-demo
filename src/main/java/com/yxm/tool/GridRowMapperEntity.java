package com.yxm.tool;

import com.yxm.entity.gridsEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GridRowMapperEntity implements RowMapper<gridsEntity> {
    @Override
    public gridsEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        gridsEntity grids=new gridsEntity();
        grids.setGridID(resultSet.getString("gridID"));
        grids.setGridName(resultSet.getString("gridName"));
        grids.setGridKucun(resultSet.getString("gridKucun"));
        grids.setGridPrice(resultSet.getString("gridPrice"));
        return grids;
    }
}
