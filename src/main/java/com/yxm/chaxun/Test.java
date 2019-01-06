package com.yxm.chaxun;

import java.util.Timer;

public class Test {
    public static void main(String[] args){
        Timer timer=new Timer();
        timer.schedule(new Callingmethod(),1000,120000);
    }
}
