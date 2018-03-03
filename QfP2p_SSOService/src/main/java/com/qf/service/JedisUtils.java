package com.qf.service;

import redis.clients.jedis.Jedis;

public class JedisUtils {
    private static String url="10.0.127.179";
    private static String auth="6666";
    private static Jedis jedis;
    static {
        jedis=new Jedis(url,6379);
        jedis.auth(auth);
    }
    //设置内容
    public static boolean setKey(String key,String value){
        jedis.set(key,value);
        jedis.expire(key,30*60);
        return true;
    }
    //设置有效期
    public  static void setTime(String key){
        jedis.expire(key,1800);
    }
    //获取内容
    public static String getValue(String key){
        return jedis.get(key);
    }
    //删除指定key
    public static void remove(String key){
        jedis.del(key);
    }
}
