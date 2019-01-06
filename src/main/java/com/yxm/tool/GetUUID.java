package com.yxm.tool;

import java.util.Random;
import java.util.UUID;

public class GetUUID {
    public static String getUUID(){
        String uuid= UUID.randomUUID().toString().replaceAll("-","");
        return uuid;
    }
    public static int yanzma(){
        Random random=new Random();
        int x=random.nextInt(9999-1000+1)+100000;
        return x;
    }
}
