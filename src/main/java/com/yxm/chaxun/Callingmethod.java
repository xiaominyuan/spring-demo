package com.yxm.chaxun;

import java.sql.*;
import java.util.TimerTask;

public class Callingmethod extends TimerTask {
    public static int count=0;
    public static int messacount=0;
    public static int onedaycount=0;
    public static int yesdaycount=0;
    public static int sevendaycount=0;
    @Override
    public void run() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://localhost/yuanxiaomin?useUnicode=true&characterEncoding=utf-8&autoReconnect=true&amp;failOverReadOnly=false&allowPublicKeyRetrieval=true";
            String url="jdbc:mysql://localhost:3306/yuanxiaomin?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
            String username = "root";
            String password = "123456";
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("MySQL链接成功");
                Statement statement = connection.createStatement();
                String sql = "SELECT count(*) FROM user";
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    count = resultSet.getInt(1);
                }

                String sql2 = "SELECT count(*) FROM forum";
                ResultSet resultSet2 = statement.executeQuery(sql2);
                while (resultSet2.next()) {
                    messacount = resultSet2.getInt(1);
                }

                String sql3 = "SELECT count(*) FROM forum WHERE TO_DAYS(NOW())=TO_DAYS(forumTime)";
                ResultSet resultSet3 = statement.executeQuery(sql3);
                while (resultSet3.next()) {
                    onedaycount = resultSet3.getInt(1);
                }

                String sql4 = "select count(*) from forum where TO_DAYS(NOW())-TO_DAYS(forumTime)";
                ResultSet resultSet4 = statement.executeQuery(sql4);
                while (resultSet4.next()) {
                    yesdaycount = resultSet4.getInt(1);
                }

                String sql5 = "select count(*) from forum where TO_DAYS(NOW())-TO_DAYS(forumTime)";
                ResultSet resultSet5 = statement.executeQuery(sql5);
                while (resultSet5.next()) {
                    sevendaycount = resultSet.getInt(1);
                }

            }
            else {
                System.out.println("mysql链接失败");
            connection.close();}

        }catch (ClassNotFoundException e){e.printStackTrace();}
        catch (SQLException e){e.printStackTrace();}
    }
}
