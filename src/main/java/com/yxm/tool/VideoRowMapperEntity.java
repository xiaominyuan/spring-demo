package com.yxm.tool;

import com.yxm.entity.videoEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VideoRowMapperEntity implements RowMapper<videoEntity> {
    @Override
    public videoEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        videoEntity video=new videoEntity();
        video.setVideoID(resultSet.getString("videoID"));
        video.setVideoAddrs(resultSet.getString("videoAddrs"));
        video.setVideoCategory(resultSet.getString("videoCategory"));
        video.setVideoCollection(resultSet.getString("videoCollection"));
        video.setVideoImage(resultSet.getString("videoImage"));
        video.setVideoLookTime(resultSet.getString("videoLookTime"));
        video.setVideoName(resultSet.getString("videoName"));
        video.setVideoStat(resultSet.getString("videoStat"));
        video.setVideoTime(resultSet.getString("videoTime"));
        return video;
    }
}
