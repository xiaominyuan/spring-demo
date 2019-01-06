package com.yxm.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDataTime {
    public static String DQtime(){
        long currentTimeMillis=System.currentTimeMillis();
        Date date=new Date(currentTimeMillis);
        SimpleDateFormat dataformat=new SimpleDateFormat();
        String time=dataformat.format(date);
        System.out.println(time);
        return time;
    }
}
