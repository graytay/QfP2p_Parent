package com.qf.user.po.util;


public class RandomUtil {
    public static int createNum(int num){
        int code ;
        switch (num){
            case 1:code=(int)(Math.random()*10);
                    break;
            case 2:code=(int)(Math.random()*100);
                break;
            case 3:code=(int)(Math.random()*1000);
                break;
            case 4:code=(int)(Math.random()*10000);
                break;
            case 5:code=(int)(Math.random()*100000);
                break;
            case 6:code=(int)(Math.random()*1000000);
                break;
                default:code=(int)(Math.random()*1000000);
        }
        return code;
    }



}
